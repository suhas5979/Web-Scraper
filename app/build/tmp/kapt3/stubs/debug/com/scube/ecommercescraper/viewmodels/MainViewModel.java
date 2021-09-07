package com.scube.ecommercescraper.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eJ\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\tH\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/scube/ecommercescraper/viewmodels/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "repository", "Lcom/scube/ecommercescraper/data/Repository;", "application", "Landroid/app/Application;", "(Lcom/scube/ecommercescraper/data/Repository;Landroid/app/Application;)V", "readProducts", "Landroidx/lifecycle/LiveData;", "", "Lcom/scube/ecommercescraper/data/entities/ProductEntity;", "getReadProducts", "()Landroidx/lifecycle/LiveData;", "readTrackedProducts", "Lcom/scube/ecommercescraper/data/entities/TrackedProductEntity;", "getReadTrackedProducts", "addTrackProduct", "Lkotlinx/coroutines/Job;", "trackedProductEntity", "convertToJavaObject", "Lcom/scube/ecommercescraper/models/Product;", "listOfPy", "Lcom/chaquo/python/PyObject;", "getProducts", "", "searchProduct", "", "insertProducts", "productEntity", "offlineCacheProducts", "result", "Lcom/scube/ecommercescraper/models/Result;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    
    /**
     * Database Caching And Tracking of Products
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.scube.ecommercescraper.data.entities.ProductEntity>> readProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.scube.ecommercescraper.data.entities.TrackedProductEntity>> readTrackedProducts = null;
    private final com.scube.ecommercescraper.data.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.scube.ecommercescraper.data.entities.ProductEntity>> getReadProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.scube.ecommercescraper.data.entities.TrackedProductEntity>> getReadTrackedProducts() {
        return null;
    }
    
    private final kotlinx.coroutines.Job insertProducts(com.scube.ecommercescraper.data.entities.ProductEntity productEntity) {
        return null;
    }
    
    public final void getProducts(@org.jetbrains.annotations.NotNull()
    java.lang.String searchProduct) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addTrackProduct(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.data.entities.TrackedProductEntity trackedProductEntity) {
        return null;
    }
    
    private final void offlineCacheProducts(com.scube.ecommercescraper.models.Result result) {
    }
    
    /**
     * Conversion of Python List of Products into Java List of Products
     */
    private final java.util.List<com.scube.ecommercescraper.models.Product> convertToJavaObject(java.util.List<? extends com.chaquo.python.PyObject> listOfPy) {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.data.Repository repository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}