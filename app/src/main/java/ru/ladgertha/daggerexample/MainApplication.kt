package ru.ladgertha.daggerexample

import android.app.Application
import ru.ladgertha.daggerexample.di.DiProvider
import ru.ladgertha.daggerexample.di.SubComponents

class MainApplication: Application(), SubComponents {

    override fun onCreate() {
        super.onCreate()
        DiProvider.buildDi(this)
    }
}