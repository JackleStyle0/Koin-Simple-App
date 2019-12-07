package com.jackle.koinsimple

import android.util.Log
import androidx.lifecycle.LiveData


interface HelloRepository {
    fun getAllMenu(): LiveData<List<Menu>>
}

class HelloRepositoryImpl(val menuDao: MenuDao) : HelloRepository  {

    override fun getAllMenu(): LiveData<List<Menu>> = menuDao.getAllMenu()
}