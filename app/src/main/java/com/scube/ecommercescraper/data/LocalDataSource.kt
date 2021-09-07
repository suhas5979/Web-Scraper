package com.scube.ecommercescraper.data

import com.scube.ecommercescraper.data.entities.ProductEntity
import com.scube.ecommercescraper.data.entities.TrackedProductEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(private val productDao: ProductDao) {

    fun readProducts(): Flow<List<ProductEntity>> {
        return productDao.readProducts()
    }

    suspend fun insertProduct(productEntity: ProductEntity) {
        productDao.insertProducts(productEntity)
    }

    fun readTrackedProducts(): Flow<List<TrackedProductEntity>> {
        return productDao.readTrackedProducts()
    }

    suspend fun insertTrackedProduct(trackedProductEntity: TrackedProductEntity) {
        productDao.insertTrackedProduct(trackedProductEntity)
    }

    fun deleteTrackedProduct(trackedProductEntity: TrackedProductEntity) {
        productDao.deleteTrackedProduct(trackedProductEntity)
    }
}