package com.dhartwich.challengeml.simpsons

import android.os.Bundle
import android.util.Log
import com.dhartwich.challengeml.R
import dagger.android.DaggerActivity
import javax.inject.Inject
import javax.inject.Named

class SimpsonsActivity : DaggerActivity(), SimpsonsView {
    @Inject fun logInjection() {
        Log.i("SimpsonsActivity", "Injecting " + SimpsonsActivity::class.java.simpleName)
    }

    @Inject @Named("simpsons")  lateinit var simpsons: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simpsons)
        Log.d("SimpsonsActivity", simpsons)
    }
}
