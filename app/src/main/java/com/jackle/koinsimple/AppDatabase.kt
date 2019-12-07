package com.jackle.koinsimple

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Menu::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract val menuDao: MenuDao
}