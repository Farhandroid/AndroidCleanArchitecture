package com.farhan.tanvir.androidcleanarchitecture.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.farhan.tanvir.androidcleanarchitecture.R
import java.util.*


@Composable
fun ReleaseDateComponent(releaseDate: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_date_range_24),
            contentDescription = null,
            modifier = Modifier.padding(
                end = 2.dp,
            )
        )
        Text(text = releaseDate, style = MaterialTheme.typography.body2)
    }
}