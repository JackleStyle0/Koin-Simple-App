package com.jackle.koinsimple

import kotlinx.coroutines.Deferred
import retrofit2.http.GET


interface UserApi {

    @GET("users")
    fun getAllAsync(): Deferred<List<GithubUser>>
}