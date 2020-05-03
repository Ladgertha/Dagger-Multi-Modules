package ru.ladgertha.feature_one_impl.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.ladgertha.feature_one_api.FeatureStarter
import ru.ladgertha.feature_one_impl.FeatureStarterImpl

@Module
abstract class FeatureModule {

    @Binds
    abstract fun provideFeatureStarter(featureStarterImpl: FeatureStarterImpl): FeatureStarter
}