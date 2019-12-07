package com.jackle.koinsimple

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class HelloViewModel(private val repository: HelloRepository): ViewModel() {

    fun getSayHello(): LiveData<List<Menu>> = repository.getAllMenu()
}