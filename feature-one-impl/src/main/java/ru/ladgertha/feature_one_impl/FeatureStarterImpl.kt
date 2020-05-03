package ru.ladgertha.feature_one_impl

import android.content.Context
import android.content.Intent
import ru.ladgertha.feature_one_api.FeatureStarter
import javax.inject.Inject

class FeatureStarterImpl @Inject constructor(private val context: Context): FeatureStarter {
    override fun start() {
        val intent = Intent(context, FeatureActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}