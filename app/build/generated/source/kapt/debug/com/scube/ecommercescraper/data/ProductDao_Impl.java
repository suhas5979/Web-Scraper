package com.scube.ecommercescraper.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.scube.ecommercescraper.data.entities.ProductEntity;
import com.scube.ecommercescraper.data.entities.TrackedProductEntity;
import com.scube.ecommercescraper.models.Product;
import com.scube.ecommercescraper.models.Result;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductEntity> __insertionAdapterOfProductEntity;

  private final ProductTypeConverter __productTypeConverter = new ProductTypeConverter();

  private final EntityInsertionAdapter<TrackedProductEntity> __insertionAdapterOfTrackedProductEntity;

  private final EntityDeletionOrUpdateAdapter<TrackedProductEntity> __deletionAdapterOfTrackedProductEntity;

  public ProductDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductEntity = new EntityInsertionAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `productTable` (`id`,`result`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = __productTypeConverter.resultToString(value.getResult());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
      }
    };
    this.__insertionAdapterOfTrackedProductEntity = new EntityInsertionAdapter<TrackedProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `trackedProductTable` (`id`,`product`,`timeStamp`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrackedProductEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = __productTypeConverter.productToString(value.getProduct());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final long _tmp_1;
        _tmp_1 = __productTypeConverter.dateToTimeStamp(value.getTimeStamp());
        stmt.bindLong(3, _tmp_1);
      }
    };
    this.__deletionAdapterOfTrackedProductEntity = new EntityDeletionOrUpdateAdapter<TrackedProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `trackedProductTable` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrackedProductEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insertProducts(final ProductEntity productEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductEntity.insert(productEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertTrackedProduct(final TrackedProductEntity trackedProductEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTrackedProductEntity.insert(trackedProductEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void deleteTrackedProduct(final TrackedProductEntity trackedProductEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTrackedProductEntity.handle(trackedProductEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<ProductEntity>> readProducts() {
    final String _sql = "SELECT * FROM productTable ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"productTable"}, new Callable<List<ProductEntity>>() {
      @Override
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfResult = CursorUtil.getColumnIndexOrThrow(_cursor, "result");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ProductEntity _item;
            final Result _tmpResult;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfResult);
            _tmpResult = __productTypeConverter.stringToResult(_tmp);
            _item = new ProductEntity(_tmpResult);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TrackedProductEntity>> readTrackedProducts() {
    final String _sql = "SELECT * FROM trackedProductTable ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"trackedProductTable"}, new Callable<List<TrackedProductEntity>>() {
      @Override
      public List<TrackedProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfProduct = CursorUtil.getColumnIndexOrThrow(_cursor, "product");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final List<TrackedProductEntity> _result = new ArrayList<TrackedProductEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TrackedProductEntity _item;
            final Product _tmpProduct;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfProduct);
            _tmpProduct = __productTypeConverter.stringToProduct(_tmp);
            final Date _tmpTimeStamp;
            final long _tmp_1;
            _tmp_1 = _cursor.getLong(_cursorIndexOfTimeStamp);
            _tmpTimeStamp = __productTypeConverter.fromDataStamp(_tmp_1);
            _item = new TrackedProductEntity(_tmpProduct,_tmpTimeStamp);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
