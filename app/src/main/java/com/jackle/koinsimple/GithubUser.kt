package com.jackle.koinsimple

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class GithubUser(
    @PrimaryKey val id: Long,
    val login: String,
    val avatar_url: String
)