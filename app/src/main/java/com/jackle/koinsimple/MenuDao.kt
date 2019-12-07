package com.jackle.koinsimple

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface MenuDao {

    @Query("SELECT * FROM menus")
    fun getAllMenu(): LiveData<List<Menu>>
}