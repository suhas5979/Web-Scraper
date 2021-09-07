package com.scube.ecommercescraper.data.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "trackedProductTable")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/scube/ecommercescraper/data/entities/TrackedProductEntity;", "", "product", "Lcom/scube/ecommercescraper/models/Product;", "timeStamp", "Ljava/util/Date;", "(Lcom/scube/ecommercescraper/models/Product;Ljava/util/Date;)V", "id", "", "getId", "()I", "setId", "(I)V", "getProduct", "()Lcom/scube/ecommercescraper/models/Product;", "setProduct", "(Lcom/scube/ecommercescraper/models/Product;)V", "getTimeStamp", "()Ljava/util/Date;", "setTimeStamp", "(Ljava/util/Date;)V", "app_debug"})
public final class TrackedProductEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    private com.scube.ecommercescraper.models.Product product;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date timeStamp;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scube.ecommercescraper.models.Product getProduct() {
        return null;
    }
    
    public final void setProduct(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.models.Product p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getTimeStamp() {
        return null;
    }
    
    public final void setTimeStamp(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public TrackedProductEntity(@org.jetbrains.annotations.NotNull()
    com.scube.ecommercescraper.models.Product product, @org.jetbrains.annotations.NotNull()
    java.util.Date timeStamp) {
        super();
    }
}