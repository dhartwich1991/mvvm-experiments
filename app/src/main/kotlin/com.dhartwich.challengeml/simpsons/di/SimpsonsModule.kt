package com.dhartwich.challengeml.simpsons.di

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Feature level module holds all the bindings needed for this feature.
 */
@Module
internal abstract class SimpsonsModule {
//    @Binds internal abstract fun mainView(act: SimpsonsActivity): SimpsonsView

    @Provides @Named("simpsons") fun provideString(): String {
        return "Simpsons dadadadadaaa"
    }
}