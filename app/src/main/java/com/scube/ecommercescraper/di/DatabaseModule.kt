package com.scube.ecommercescraper.di

import android.content.Context
import androidx.room.Room
import com.scube.ecommercescraper.data.ProductDatabase
import com.scube.ecommercescraper.utils.Constants.Companion.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context :Context
    ) = Room.databaseBuilder(
        context,
        ProductDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideDao(database: ProductDatabase) = database.productDao()
}