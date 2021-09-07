package com.scube.ecommercescraper.data

import androidx.room.*
import com.scube.ecommercescraper.data.entities.ProductEntity
import com.scube.ecommercescraper.data.entities.TrackedProductEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProducts(productEntity: ProductEntity)

    @Query("SELECT * FROM productTable ORDER BY id ASC")
    fun readProducts(): Flow<List<ProductEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTrackedProduct(trackedProductEntity: TrackedProductEntity)

    @Query("SELECT * FROM trackedProductTable ORDER BY id ASC")
    fun readTrackedProducts():Flow<List<TrackedProductEntity>>

    @Delete
    fun deleteTrackedProduct(trackedProductEntity: TrackedProductEntity)
}