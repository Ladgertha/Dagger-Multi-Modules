package ru.ladgertha.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.ladgertha.daggerexample.di.main.MainComponent
import ru.ladgertha.daggerexample.di.main.MainComponentProvider
import ru.ladgertha.feature_one_api.FeatureStarter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var featureStarter: FeatureStarter

    lateinit var mainComponent: MainComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        mainComponent = (applicationContext as MainComponentProvider).provideMainComponent()
        mainComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        featureStarter.start()
    }
}
