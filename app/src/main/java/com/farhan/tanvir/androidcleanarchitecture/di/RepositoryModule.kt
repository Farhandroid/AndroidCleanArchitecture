package com.farhan.tanvir.androidcleanarchitecture.di

import com.farhan.tanvir.data.repository.MovieRepositoryImpl
import com.farhan.tanvir.data.repository.dataSource.MovieLocalDataSource
import com.farhan.tanvir.data.repository.dataSource.MovieRemoteDataSource
import com.farhan.tanvir.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideMoviesRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource
    ): MovieRepository =
        MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource = movieLocalDataSource)
}