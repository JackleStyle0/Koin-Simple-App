package com.jackle.koinsimple

import android.app.Application
import androidx.room.Room
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val databaseModule = module {

    fun provideDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "shopp.db")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
    }


    fun provideMenuDao(database: AppDatabase): MenuDao {
        return database.menuDao
    }

    single { provideDatabase(androidApplication()) }
    single { provideMenuDao(get()) }
}

val repositoryModule = module {

    fun provideMenuRepository(menuDao: MenuDao): HelloRepository {
        return HelloRepositoryImpl(menuDao)
    }

    single { provideMenuRepository(get()) }
}

val viewModeiModule = module {
    viewModel{ HelloViewModel(get()) }
}