package com.jackle.koinsimple

import org.koin.core.KoinComponent
import org.koin.core.inject

class HelloApplication: KoinComponent {

    // Inject HelloService
    val helloService by inject<HelloService>()

    // display our data
    fun sayHello() = println(helloService.hello())
}