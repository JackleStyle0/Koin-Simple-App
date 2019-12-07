package com.jackle.koinsimple


interface HelloRepository {
    fun giveHello(): String
}

class HelloRepositoryImpl() : HelloRepository  {

    override fun giveHello() = "Hello Koin"
}