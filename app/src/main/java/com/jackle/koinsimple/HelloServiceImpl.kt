package com.jackle.koinsimple


interface HelloService {
    fun hello(): String
}

class HelloServiceImpl(private val helloMessageData: HelloMessageData) : HelloService  {

    override fun hello() = "Hey, ${helloMessageData.message}"
}