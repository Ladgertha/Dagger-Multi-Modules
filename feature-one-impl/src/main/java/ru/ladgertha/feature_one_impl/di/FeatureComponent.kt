package ru.ladgertha.feature_one_impl.di

import dagger.Subcomponent
import ru.ladgertha.feature_one_impl.FeatureActivity

@Subcomponent(modules = [FeatureModule::class])
interface FeatureComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): FeatureComponent
    }

    fun inject(activity: FeatureActivity)
}