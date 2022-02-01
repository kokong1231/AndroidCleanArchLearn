package com.example.cleanarcitacter1

import android.app.Application
import com.example.cleanarcitacter1.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class AppApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // TODO Koin Trigger
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@AppApplication)
            modules(appModule)
        }
    }
}