package ru.ladgertha.feature_two_impl.di

import dagger.Binds
import dagger.Module
import ru.ladgertha.feature_two_api.FeatureTwoStarter
import ru.ladgertha.feature_two_impl.FeatureTwoStarterImpl

@Module
abstract class FeatureTwoModule {

    @Binds
    abstract fun provideFeatureTwoStarter(featureTwoStarterImpl: FeatureTwoStarterImpl): FeatureTwoStarter
}