package ru.ladgertha.daggerexample

import android.app.Application
import ru.ladgertha.daggerexample.di.DiProvider
import ru.ladgertha.daggerexample.di.main.MainComponent
import ru.ladgertha.daggerexample.di.main.MainComponentProvider
import ru.ladgertha.feature_one_impl.di.FeatureComponent
import ru.ladgertha.feature_one_impl.di.FeatureComponentProvider
import ru.ladgertha.feature_two_impl.di.FeatureTwoComponent
import ru.ladgertha.feature_two_impl.di.FeatureTwoComponentProvider

class MainApplication: Application(), FeatureComponentProvider,
    MainComponentProvider, FeatureTwoComponentProvider {

    override fun onCreate() {
        super.onCreate()
        DiProvider.buildDi(this)
    }

    override fun provideFeatureComponent(): FeatureComponent {
        return DiProvider.appComponent().featureComponent.create()
    }

    override fun provideMainComponent(): MainComponent {
        return DiProvider.appComponent().mainComponent.create()
    }

    override fun provideFeatureTwoComponent(): FeatureTwoComponent {
        return DiProvider.appComponent().featureTwoComponent.create()
    }
}