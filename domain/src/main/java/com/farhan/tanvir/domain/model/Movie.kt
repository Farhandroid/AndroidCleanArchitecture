package com.farhan.tanvir.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "movies")
data class Movie(
    @PrimaryKey(autoGenerate = true)
    var pk: Long = 0,
    @SerializedName("id")
    val movieId: Int,
    @SerializedName("overview")
    val overview: String?,
    @SerializedName("poster_path")
    val posterPath: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("vote_average")
    val rating: String?,
    @SerializedName("release_date")
    val releaseDate: String?,
) : Serializable