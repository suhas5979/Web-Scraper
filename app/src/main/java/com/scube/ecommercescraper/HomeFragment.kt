package com.scube.ecommercescraper

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.scube.ecommercescraper.adapters.ProductAdapter
import com.scube.ecommercescraper.data.entities.TrackedProductEntity
import com.scube.ecommercescraper.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import java.util.*
import kotlin.collections.ArrayList

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var mView: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_home, container, false)

        subscribeToObservers()
        mView.btnScrape.setOnClickListener {
            val searchProduct = mView.etSearch.text.toString()

            mainViewModel.getProducts(searchProduct)
        }
        mView.ibMore.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_trackedFragment)
        }

        return mView
    }

    private fun subscribeToObservers() {
        mainViewModel.readProducts.observe(viewLifecycleOwner) { databaseEntity ->
            Log.i("debug", "database subscribed called")
            if (databaseEntity.isNotEmpty()) {
                mView.tvSearchedProduct.text = "Recently Searched"
                val adapter =
                    ProductAdapter(requireActivity(), ArrayList(databaseEntity[0].result.products)){ product ->
                        val entity = TrackedProductEntity(product,timeStamp = Date())
                        mainViewModel.addTrackProduct(entity)
                    }
                mView.searchedProductRecyclerView.layoutManager =
                    LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
                mView.searchedProductRecyclerView.adapter = adapter
            } else {
                mView.tvSearchedProduct.text = "No Search History"
            }

        }
    }

}