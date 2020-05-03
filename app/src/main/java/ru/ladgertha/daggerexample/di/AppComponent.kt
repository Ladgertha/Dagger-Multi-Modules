package ru.ladgertha.daggerexample.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.ladgertha.daggerexample.di.main.MainComponent
import ru.ladgertha.feature_one_impl.di.FeatureComponent
import ru.ladgertha.feature_two_impl.di.FeatureTwoComponent
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    val mainComponent: MainComponent.Factory
    val featureComponent: FeatureComponent.Factory
    val featureTwoComponent: FeatureTwoComponent.Factory
}