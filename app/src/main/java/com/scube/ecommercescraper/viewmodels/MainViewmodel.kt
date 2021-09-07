package com.scube.ecommercescraper.viewmodels

import android.app.Application
import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.chaquo.python.PyException
import com.chaquo.python.PyObject
import com.chaquo.python.Python
import com.chaquo.python.android.AndroidPlatform
import com.scube.ecommercescraper.data.Repository
import com.scube.ecommercescraper.models.Product
import com.scube.ecommercescraper.data.entities.ProductEntity
import com.scube.ecommercescraper.data.entities.TrackedProductEntity
import com.scube.ecommercescraper.models.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val repository: Repository,
    application: Application
) : AndroidViewModel(application) {

    /**
      Database Caching And Tracking of Products
     **/
    val readProducts: LiveData<List<ProductEntity>> = repository.local.readProducts().asLiveData()
    val readTrackedProducts : LiveData<List<TrackedProductEntity>> = repository.local.readTrackedProducts().asLiveData()
    private fun insertProducts(productEntity: ProductEntity) =
        viewModelScope.launch(Dispatchers.IO) {
            repository.local.insertProduct(productEntity)
        }
    fun getProducts(searchProduct: String) {

        try {
            viewModelScope.launch {
                Log.i("debug", "python started")
                if (!Python.isStarted()) {
                    Python.start(AndroidPlatform(getApplication()))
                }
                Log.i("debug", "Python module import")
                val py = Python.getInstance()
                val module = py.getModule("amazon_scrape")
                Log.i("debug", "before python function call")
                val listOfPy = module.callAttr("scrape_on_amazon", searchProduct, 10).asList()
                Log.i("debug", "after python function call....")
                val products = convertToJavaObject(listOfPy)
                if (products != null) {
                    val result = Result(products)
                    offlineCacheProducts(result)
                }
            }
        } catch (e: PyException) {
            e.printStackTrace()
        }
    }

    fun addTrackProduct(trackedProductEntity: TrackedProductEntity) = viewModelScope.launch(Dispatchers.IO) {
        repository.local.insertTrackedProduct(trackedProductEntity)
    }

    private fun offlineCacheProducts(result: Result) {
        val productEntity =
            ProductEntity(result)
        insertProducts(productEntity)
    }

    /**
     * Conversion of Python List of Products into Java List of Products
     */
    private fun convertToJavaObject(listOfPy: List<PyObject>): List<Product>? {
        val products = ArrayList<Product>()
        for (py in listOfPy) {
            val resultMap = py.asMap()
            val keys = ArrayList(resultMap.keys)
            val productName = keys[0].toString()
            val productMrp =
                ArrayList(resultMap[keys[0]]!!.asList()[0].asMap().values)[0].toString()
            val productPrice =
                ArrayList(resultMap[keys[0]]!!.asList()[1].asMap().values)[0].toString()
            val productImageUrl = resultMap[keys[1]]!!.toString()
            val productPageUrl = resultMap[keys[2]]!!.toString()
            val product =
                Product(productName, productPrice, productMrp, productImageUrl, productPageUrl)
            products.add(product)
        }
        Log.i("debug", products.toString())
        return products
    }
}