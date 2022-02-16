package com.farhan.tanvir.androidcleanarchitecture.di

import com.farhan.tanvir.domain.repository.MovieRepository
import com.farhan.tanvir.domain.useCase.GetMoviesFromDBUseCase
import com.farhan.tanvir.domain.useCase.GetPopularMoviesUseCase
import com.farhan.tanvir.domain.useCase.MovieUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideMovieUseCases(movieRepository: MovieRepository) = MovieUseCases(
        getPopularMoviesUseCase = GetPopularMoviesUseCase(movieRepository = movieRepository),
        getMoviesFromDBUseCase = GetMoviesFromDBUseCase(movieRepository = movieRepository)
    )
}