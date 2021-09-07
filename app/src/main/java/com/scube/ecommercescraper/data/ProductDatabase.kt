package com.scube.ecommercescraper.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.scube.ecommercescraper.data.entities.ProductEntity
import com.scube.ecommercescraper.data.entities.TrackedProductEntity

@Database(
    entities = [ProductEntity::class,TrackedProductEntity::class],
    exportSchema = false,
    version = 1
)
@TypeConverters(ProductTypeConverter::class)
abstract class ProductDatabase : RoomDatabase() {
    abstract fun productDao() : ProductDao
}