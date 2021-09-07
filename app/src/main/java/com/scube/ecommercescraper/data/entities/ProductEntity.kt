package com.scube.ecommercescraper.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.scube.ecommercescraper.models.Result
import com.scube.ecommercescraper.utils.Constants.Companion.PRODUCT_TABLE

@Entity(tableName = PRODUCT_TABLE)
class ProductEntity(
        var result: Result
) {
    @PrimaryKey(autoGenerate = false)
    var id : Int = 0
}