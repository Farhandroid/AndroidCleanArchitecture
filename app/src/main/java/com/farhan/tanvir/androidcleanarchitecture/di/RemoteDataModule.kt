package com.farhan.tanvir.androidcleanarchitecture.di

import com.farhan.tanvir.data.api.MovieApi
import com.farhan.tanvir.data.repository.dataSource.MovieRemoteDataSource
import com.farhan.tanvir.data.repository.dataSourceImpl.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {
    @Provides
    fun provideMoviesRemoteDataSource(movieApi: MovieApi) : MovieRemoteDataSource =
        MovieRemoteDataSourceImpl(movieApi)
}