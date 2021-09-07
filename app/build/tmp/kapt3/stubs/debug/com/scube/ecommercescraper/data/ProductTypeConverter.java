package com.scube.ecommercescraper.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/scube/ecommercescraper/data/ProductTypeConverter;", "", "()V", "gson", "Lcom/google/gson/Gson;", "dateToTimeStamp", "", "data", "Ljava/util/Date;", "fromDataStamp", "productToString", "", "product", "Lcom/scube/ecommercescraper/models/Product;", "resultToString", "result", "Lcom/scube/ecommercescraper/models/Result;", "stringToProduct", "stringToResult", "app_debug"})
public final class ProductTypeConverter {
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String resultToString(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.models.Result result) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.scube.ecommercescraper.models.Result stringToResult(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String productToString(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.models.Product product) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.scube.ecommercescraper.models.Product stringToProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.Date fromDataStamp(long data) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    public final long dateToTimeStamp(@org.jetbrains.annotations.NotNull()
    java.util.Date data) {
        return 0L;
    }
    
    public ProductTypeConverter() {
        super();
    }
}