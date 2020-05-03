package ru.ladgertha.daggerexample.di.main

import ru.ladgertha.daggerexample.di.main.MainComponent

interface MainComponentProvider {
    fun provideMainComponent(): MainComponent
}