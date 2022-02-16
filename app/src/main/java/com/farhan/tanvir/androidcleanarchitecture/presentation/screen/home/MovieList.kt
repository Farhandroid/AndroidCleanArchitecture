package com.farhan.tanvir.androidcleanarchitecture.presentation.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.items
import coil.compose.rememberImagePainter
import coil.size.Scale
import com.farhan.tanvir.androidcleanarchitecture.BuildConfig
import com.farhan.tanvir.androidcleanarchitecture.presentation.components.RatingComponent
import com.farhan.tanvir.androidcleanarchitecture.presentation.navigation.Screen
import com.farhan.tanvir.androidcleanarchitecture.ui.theme.ItemBackgroundColor
import com.farhan.tanvir.domain.model.Movie

@Composable
fun MovieListContent(allMovies: LazyPagingItems<Movie>, navController: NavHostController) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
    ) {
        items(
            items = allMovies,
            key = { movie ->
                movie.pk
            }
        ) { movie ->
            if (movie != null) {
                MovieListItem(movie = movie, navController = navController)
            }
        }
    }
}

@Composable
fun MovieListItem(movie: Movie, navController: NavHostController) {
    Card(
        modifier = Modifier
            .padding(top = 8.dp)
            .height(180.dp)
            .fillMaxWidth(),
        elevation = 4.dp,
        backgroundColor = MaterialTheme.colors.ItemBackgroundColor
    ) {
        Row(
            modifier = Modifier
                .height(IntrinsicSize.Max)
                .fillMaxWidth()
                .clickable {
                    navController.navigate(route = Screen.MovieDetails.passMovieId(movie.movieId.toString()))
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            movie.posterPath?.let {
                Image(
                    modifier = Modifier
                        .padding(
                            end = 4.dp,
                        )
                        .width(120.dp),
                    painter = rememberImagePainter(
                        data = BuildConfig.POSTER_URL + movie.posterPath, builder = {
                            crossfade(true)
                            scale(Scale.FILL)
                        }),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
            }
            Column(Modifier
                .height(IntrinsicSize.Max)
                .padding(
                    end = 2.dp,
                )) {
                movie.title?.let { Text(text = it, style = MaterialTheme.typography.body1) }
                Spacer(modifier = Modifier.height(4.dp))
                movie.overview?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.body2,
                        maxLines = 4,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                movie.rating?.let { RatingComponent(rating = it) }
            }
        }
    }
}
