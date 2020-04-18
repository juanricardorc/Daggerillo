package com.juanricardorc.daggerillo.presentation.menu.di;

import com.juanricardorc.daggerillo.presentation.menu.dashboard.DashboardFragment;
import com.juanricardorc.daggerillo.presentation.menu.home.HomeFragment;
import com.juanricardorc.daggerillo.presentation.menu.notification.NotificationsFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MenuFragmentBuildersModule {
    @ContributesAndroidInjector
    abstract DashboardFragment contributeDashboardFragment();

    @ContributesAndroidInjector
    abstract HomeFragment contributeHomeFragment();

    @ContributesAndroidInjector
    abstract NotificationsFragment contributeNotificationsFragment();
}
