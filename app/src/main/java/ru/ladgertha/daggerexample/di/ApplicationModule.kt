package ru.ladgertha.daggerexample.di

import dagger.Module
import ru.ladgertha.daggerexample.di.main.MainComponent
import ru.ladgertha.feature_one_impl.di.FeatureComponent
import ru.ladgertha.feature_one_impl.di.FeatureModule
import ru.ladgertha.feature_two_impl.di.FeatureTwoComponent
import ru.ladgertha.feature_two_impl.di.FeatureTwoModule


@Module(
    subcomponents = [FeatureComponent::class, MainComponent::class, FeatureTwoComponent::class],
    includes = [FeatureModule::class, FeatureTwoModule::class]
)
class ApplicationModule