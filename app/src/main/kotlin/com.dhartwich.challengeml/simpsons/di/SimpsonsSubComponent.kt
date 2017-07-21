package com.dhartwich.challengeml.simpsons.di

import com.dhartwich.challengeml.simpsons.SimpsonsActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Feature level component
 */
@Subcomponent(modules = arrayOf(SimpsonsModule::class))
interface SimpsonsSubComponent : AndroidInjector<SimpsonsActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<SimpsonsActivity>()
}
