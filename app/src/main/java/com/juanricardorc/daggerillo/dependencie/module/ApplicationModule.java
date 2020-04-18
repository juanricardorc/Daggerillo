package com.juanricardorc.daggerillo.dependencie.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    @Singleton
    @Provides
    static String getVersion() {
        return new String("v1.0.3");
    }
}
