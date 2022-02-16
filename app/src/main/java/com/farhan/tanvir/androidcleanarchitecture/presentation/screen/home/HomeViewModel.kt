package com.farhan.tanvir.androidcleanarchitecture.presentation.screen.home

import androidx.lifecycle.ViewModel
import com.farhan.tanvir.domain.useCase.MovieUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    movieUseCases: MovieUseCases,
) : ViewModel() {
    val getAllPopularMovies = movieUseCases.getPopularMoviesUseCase()

}