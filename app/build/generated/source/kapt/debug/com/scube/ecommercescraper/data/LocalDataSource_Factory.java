package com.scube.ecommercescraper.data;

import dagger.internal.Factory;
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
public final class LocalDataSource_Factory implements Factory<LocalDataSource> {
  private final Provider<ProductDao> productDaoProvider;

  public LocalDataSource_Factory(Provider<ProductDao> productDaoProvider) {
    this.productDaoProvider = productDaoProvider;
  }

  @Override
  public LocalDataSource get() {
    return newInstance(productDaoProvider.get());
  }

  public static LocalDataSource_Factory create(Provider<ProductDao> productDaoProvider) {
    return new LocalDataSource_Factory(productDaoProvider);
  }

  public static LocalDataSource newInstance(ProductDao productDao) {
    return new LocalDataSource(productDao);
  }
}
