package com.jackle.koinsimple

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "menus")
class Menu(
    @PrimaryKey val id: Long,
    val name: String,
    val price: Float
)