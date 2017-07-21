package com.dhartwich.challengeml

import android.util.Log
import com.dhartwich.challengeml.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import javax.inject.Inject


class SimpsonsApplication : DaggerApplication() {
    private val TAG = SimpsonsApplication::class.java.simpleName

    override fun applicationInjector(): AndroidInjector<SimpsonsApplication> = DaggerApplicationComponent
            .builder()
            .create(this@SimpsonsApplication)

//    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerApplicationComponent.builder()
//            .application(this)
//            .build()

    @Inject
    fun logInjection() {
        Log.i(TAG, "Injecting " + SimpsonsApplication::class.java.simpleName)
    }
}