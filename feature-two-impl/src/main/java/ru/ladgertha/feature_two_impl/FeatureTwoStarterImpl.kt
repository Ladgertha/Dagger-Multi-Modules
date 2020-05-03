package ru.ladgertha.feature_two_impl

import android.content.Context
import android.content.Intent
import ru.ladgertha.feature_two_api.FeatureTwoStarter
import javax.inject.Inject

class FeatureTwoStarterImpl @Inject constructor(private val context: Context) : FeatureTwoStarter {
    override fun start() {
        val intent = Intent(context, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}