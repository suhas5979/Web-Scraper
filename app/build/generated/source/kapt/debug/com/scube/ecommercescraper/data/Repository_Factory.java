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
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<LocalDataSource> localDataSourceProvider;

  public Repository_Factory(Provider<LocalDataSource> localDataSourceProvider) {
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public Repository get() {
    return newInstance(localDataSourceProvider.get());
  }

  public static Repository_Factory create(Provider<LocalDataSource> localDataSourceProvider) {
    return new Repository_Factory(localDataSourceProvider);
  }

  public static Repository newInstance(LocalDataSource localDataSource) {
    return new Repository(localDataSource);
  }
}
