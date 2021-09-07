package com.scube.ecommercescraper.data.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "productTable")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/scube/ecommercescraper/data/entities/ProductEntity;", "", "result", "Lcom/scube/ecommercescraper/models/Result;", "(Lcom/scube/ecommercescraper/models/Result;)V", "id", "", "getId", "()I", "setId", "(I)V", "getResult", "()Lcom/scube/ecommercescraper/models/Result;", "setResult", "app_debug"})
public final class ProductEntity {
    @androidx.room.PrimaryKey(autoGenerate = false)
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    private com.scube.ecommercescraper.models.Result result;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scube.ecommercescraper.models.Result getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.models.Result p0) {
    }
    
    public ProductEntity(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.models.Result result) {
        super();
    }
}