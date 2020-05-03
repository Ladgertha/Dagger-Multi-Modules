package ru.ladgertha.feature_one_impl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_feature.*
import ru.ladgertha.feature_one_impl.di.FeatureComponent
import ru.ladgertha.feature_one_impl.di.FeatureComponentProvider
import ru.ladgertha.feature_two_api.FeatureTwoStarter
import javax.inject.Inject

class FeatureActivity : AppCompatActivity() {

    lateinit var featureComponent: FeatureComponent
    @Inject
    lateinit var featureTwoStarter: FeatureTwoStarter

    override fun onCreate(savedInstanceState: Bundle?) {
        featureComponent = (applicationContext as FeatureComponentProvider).provideFeatureComponent()
        featureComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)
        btn_open.setOnClickListener {
            featureTwoStarter.start()
        }
    }
}
