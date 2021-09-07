package com.scube.ecommercescraper.data

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.scube.ecommercescraper.models.Product
import com.scube.ecommercescraper.models.Result
import java.util.*

class ProductTypeConverter {
    private val gson = Gson()

    @TypeConverter
    fun resultToString(result: Result): String {
        return gson.toJson(result)
    }

    @TypeConverter
    fun stringToResult(data: String): Result {
        val listType = object : TypeToken<Result>() {}.type
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun productToString(product: Product): String {
        return gson.toJson(product)
    }

    @TypeConverter
    fun stringToProduct(data: String): Product {
        val listType = object : TypeToken<Product>() {}.type
        return gson.fromJson(data, listType)

    }

    @TypeConverter
    fun fromDataStamp(data:Long):Date{
        return  Date(data)
    }

    @TypeConverter
    fun dateToTimeStamp(data:Date):Long{
        return data.time
    }
}