package com.scube.ecommercescraper.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0019\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\rH\'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\rH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/scube/ecommercescraper/data/ProductDao;", "", "deleteTrackedProduct", "", "trackedProductEntity", "Lcom/scube/ecommercescraper/data/entities/TrackedProductEntity;", "insertProducts", "productEntity", "Lcom/scube/ecommercescraper/data/entities/ProductEntity;", "(Lcom/scube/ecommercescraper/data/entities/ProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTrackedProduct", "(Lcom/scube/ecommercescraper/data/entities/TrackedProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readProducts", "Lkotlinx/coroutines/flow/Flow;", "", "readTrackedProducts", "app_debug"})
public abstract interface ProductDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertProducts(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.data.entities.ProductEntity productEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM productTable ORDER BY id ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.scube.ecommercescraper.data.entities.ProductEntity>> readProducts();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertTrackedProduct(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.data.entities.TrackedProductEntity trackedProductEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM trackedProductTable ORDER BY id ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.scube.ecommercescraper.data.entities.TrackedProductEntity>> readTrackedProducts();
    
    @androidx.room.Delete()
    public abstract void deleteTrackedProduct(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.data.entities.TrackedProductEntity trackedProductEntity);
}