package com.farhan.tanvir.androidcleanarchitecture.di

import com.farhan.tanvir.data.db.MovieDao
import com.farhan.tanvir.data.repository.dataSource.MovieLocalDataSource
import com.farhan.tanvir.data.repository.dataSourceImpl.MovieLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object LocalDataModule {
    @Provides
    fun provideLocalDataSource(movieDao: MovieDao): MovieLocalDataSource =
        MovieLocalDataSourceImpl(movieDao = movieDao)
}