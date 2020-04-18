package com.juanricardorc.daggerillo.dependencie.component;

import android.app.Application;

import com.juanricardorc.daggerillo.presentation.app.ActivityBuildersModule;
import com.juanricardorc.daggerillo.dependencie.module.ApplicationModule;
import com.juanricardorc.daggerillo.dependencie.viewmodel.ViewModelFactoryModule;
import com.juanricardorc.daggerillo.presentation.app.DaggerilloApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityBuildersModule.class,
        ApplicationModule.class,
        ViewModelFactoryModule.class})
public interface ApplicationComponent extends AndroidInjector<DaggerilloApplication> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        ApplicationComponent build();
    }
}
