package com.jackle.koinsimple

class MySimplePresenter(val repo: HelloRepository) {

    fun sayHello() = "${repo.giveHello()} from $this"
}