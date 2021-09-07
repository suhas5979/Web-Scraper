package com.scube.ecommercescraper.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0019\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\u0010J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/scube/ecommercescraper/data/LocalDataSource;", "", "productDao", "Lcom/scube/ecommercescraper/data/ProductDao;", "(Lcom/scube/ecommercescraper/data/ProductDao;)V", "deleteTrackedProduct", "", "trackedProductEntity", "Lcom/scube/ecommercescraper/data/entities/TrackedProductEntity;", "insertProduct", "productEntity", "Lcom/scube/ecommercescraper/data/entities/ProductEntity;", "(Lcom/scube/ecommercescraper/data/entities/ProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTrackedProduct", "(Lcom/scube/ecommercescraper/data/entities/TrackedProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readProducts", "Lkotlinx/coroutines/flow/Flow;", "", "readTrackedProducts", "app_debug"})
public final class LocalDataSource {
    private final com.scube.ecommercescraper.data.ProductDao productDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.scube.ecommercescraper.data.entities.ProductEntity>> readProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertProduct(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.data.entities.ProductEntity productEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.scube.ecommercescraper.data.entities.TrackedProductEntity>> readTrackedProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTrackedProduct(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.data.entities.TrackedProductEntity trackedProductEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void deleteTrackedProduct(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.data.entities.TrackedProductEntity trackedProductEntity) {
    }
    
    @javax.inject.Inject()
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.data.ProductDao productDao) {
        super();
    }
}