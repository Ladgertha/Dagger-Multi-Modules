package ru.ladgertha.feature_two_impl.di

import dagger.Subcomponent
import ru.ladgertha.feature_two_impl.MainActivity

@Subcomponent(modules = [FeatureTwoModule::class])
interface FeatureTwoComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): FeatureTwoComponent
    }

    fun inject(activity: MainActivity)
}