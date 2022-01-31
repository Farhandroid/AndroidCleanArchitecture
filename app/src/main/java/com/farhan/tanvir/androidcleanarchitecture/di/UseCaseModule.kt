package com.farhan.tanvir.androidcleanarchitecture.di

import com.farhan.tanvir.domain.repository.MovieRepository
import com.farhan.tanvir.domain.useCase.GetPopularMoviesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideGetPopularMoviesUseCase(movieRepository: MovieRepository) =
       GetPopularMoviesUseCase(movieRepository)
}