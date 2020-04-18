package com.juanricardorc.daggerillo.presentation.app;

import com.juanricardorc.daggerillo.dependencie.scope.MenuScoped;
import com.juanricardorc.daggerillo.presentation.menu.MenuActivity;
import com.juanricardorc.daggerillo.presentation.menu.di.MenuFragmentBuildersModule;
import com.juanricardorc.daggerillo.presentation.menu.home.di.HomeModule;
import com.juanricardorc.daggerillo.presentation.menu.di.MenuViewModelModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

//Modulo generador de actividades. Aquí van todas las actividades de la app.

@Module
public abstract class ActivityBuildersModule {

    @MenuScoped
    @ContributesAndroidInjector(modules = {
            MenuFragmentBuildersModule.class,
            HomeModule.class,
            MenuViewModelModule.class})
    abstract MenuActivity contributeHomeActivity();

}
