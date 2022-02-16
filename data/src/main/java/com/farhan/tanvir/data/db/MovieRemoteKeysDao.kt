package com.farhan.tanvir.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.farhan.tanvir.domain.model.MovieRemoteKeys

@Dao
interface MovieRemoteKeysDao {

    @Query("SELECT * FROM movie_remote_keys WHERE id = :movieId")
    suspend fun getMovieRemoteKeys(movieId: Int): MovieRemoteKeys?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllMovieRemoteKeys(movieRemoteKeys : List<MovieRemoteKeys>)

    @Query("DELETE FROM movie_remote_keys")
    suspend fun deleteAllMovieRemoteKeys()
}