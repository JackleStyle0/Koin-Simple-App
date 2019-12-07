package com.jackle.koinsimple

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject
import org.koin.dsl.module

class HelloApplication: Application() {

    val appModule = module {

        // single instance of HelloRepository
        single<HelloRepository> { HelloRepositoryImpl() }

        // Simple Presenter Factory
        factory { MySimplePresenter(get()) }
    }

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin{
            androidLogger()
            androidContext(this@HelloApplication)
            modules(appModule)
        }
    }
}