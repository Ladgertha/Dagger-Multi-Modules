package ru.ladgertha.daggerexample.di.main

import dagger.Subcomponent
import ru.ladgertha.daggerexample.MainActivity

@Subcomponent
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(activity: MainActivity)
}