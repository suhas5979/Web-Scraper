package com.scube.ecommercescraper.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.scube.ecommercescraper.models.Product
import com.scube.ecommercescraper.utils.Constants.Companion.TRACKED_PRODUCT_TABLE
import java.util.*

@Entity(tableName = TRACKED_PRODUCT_TABLE)
class TrackedProductEntity (
    var product:Product,
    var timeStamp: Date
){
    @PrimaryKey(autoGenerate = true)
    var id : Int = 0
}