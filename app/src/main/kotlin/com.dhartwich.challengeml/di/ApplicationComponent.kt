package com.dhartwich.challengeml.di

import com.dhartwich.challengeml.SimpsonsApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        ApplicationModule::class))
interface ApplicationComponent : AndroidInjector<SimpsonsApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<SimpsonsApplication>()
}