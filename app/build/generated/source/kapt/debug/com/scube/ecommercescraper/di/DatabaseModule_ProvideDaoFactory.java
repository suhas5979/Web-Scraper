package com.scube.ecommercescraper.di;

import com.scube.ecommercescraper.data.ProductDao;
import com.scube.ecommercescraper.data.ProductDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideDaoFactory implements Factory<ProductDao> {
  private final Provider<ProductDatabase> databaseProvider;

  public DatabaseModule_ProvideDaoFactory(Provider<ProductDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public ProductDao get() {
    return provideDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideDaoFactory create(
      Provider<ProductDatabase> databaseProvider) {
    return new DatabaseModule_ProvideDaoFactory(databaseProvider);
  }

  public static ProductDao provideDao(ProductDatabase database) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
