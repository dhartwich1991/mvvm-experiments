package com.dhartwich.challengeml.di

import com.dhartwich.challengeml.SimpsonsApplication
import com.dhartwich.challengeml.simpsons.SimpsonsActivity
import com.dhartwich.challengeml.simpsons.di.SimpsonsModule
import com.dhartwich.challengeml.simpsons.di.SimpsonsSubComponent
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Application module refers to sub components and provides application level dependencies.
 */
@Module(subcomponents = arrayOf(SimpsonsSubComponent::class))
abstract class ApplicationModule {
    @Provides fun provideContext(application: SimpsonsApplication) = application.applicationContext


    @ContributesAndroidInjector(modules = arrayOf(SimpsonsModule::class))
    abstract fun simpsonsActivity(): SimpsonsActivity
    //Provide more Application wide dependencies here.
}