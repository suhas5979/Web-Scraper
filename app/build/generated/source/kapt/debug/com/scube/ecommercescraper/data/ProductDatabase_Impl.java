package com.scube.ecommercescraper.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDatabase_Impl extends ProductDatabase {
  private volatile ProductDao _productDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `productTable` (`id` INTEGER NOT NULL, `result` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `trackedProductTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `product` TEXT NOT NULL, `timeStamp` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '12c0ea4b0f5ad129869fac1bdf03cdcd')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `productTable`");
        _db.execSQL("DROP TABLE IF EXISTS `trackedProductTable`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsProductTable = new HashMap<String, TableInfo.Column>(2);
        _columnsProductTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductTable.put("result", new TableInfo.Column("result", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProductTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProductTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProductTable = new TableInfo("productTable", _columnsProductTable, _foreignKeysProductTable, _indicesProductTable);
        final TableInfo _existingProductTable = TableInfo.read(_db, "productTable");
        if (! _infoProductTable.equals(_existingProductTable)) {
          return new RoomOpenHelper.ValidationResult(false, "productTable(com.scube.ecommercescraper.data.entities.ProductEntity).\n"
                  + " Expected:\n" + _infoProductTable + "\n"
                  + " Found:\n" + _existingProductTable);
        }
        final HashMap<String, TableInfo.Column> _columnsTrackedProductTable = new HashMap<String, TableInfo.Column>(3);
        _columnsTrackedProductTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrackedProductTable.put("product", new TableInfo.Column("product", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTrackedProductTable.put("timeStamp", new TableInfo.Column("timeStamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTrackedProductTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTrackedProductTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTrackedProductTable = new TableInfo("trackedProductTable", _columnsTrackedProductTable, _foreignKeysTrackedProductTable, _indicesTrackedProductTable);
        final TableInfo _existingTrackedProductTable = TableInfo.read(_db, "trackedProductTable");
        if (! _infoTrackedProductTable.equals(_existingTrackedProductTable)) {
          return new RoomOpenHelper.ValidationResult(false, "trackedProductTable(com.scube.ecommercescraper.data.entities.TrackedProductEntity).\n"
                  + " Expected:\n" + _infoTrackedProductTable + "\n"
                  + " Found:\n" + _existingTrackedProductTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "12c0ea4b0f5ad129869fac1bdf03cdcd", "d7e57e5b3e60f0719a2fff20679e7bc3");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "productTable","trackedProductTable");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `productTable`");
      _db.execSQL("DELETE FROM `trackedProductTable`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ProductDao productDao() {
    if (_productDao != null) {
      return _productDao;
    } else {
      synchronized(this) {
        if(_productDao == null) {
          _productDao = new ProductDao_Impl(this);
        }
        return _productDao;
      }
    }
  }
}
