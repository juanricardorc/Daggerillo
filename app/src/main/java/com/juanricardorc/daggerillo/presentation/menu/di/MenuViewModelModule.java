package com.juanricardorc.daggerillo.presentation.menu.di;

import androidx.lifecycle.ViewModel;

import com.juanricardorc.daggerillo.dependencie.viewmodel.ViewModelKey;
import com.juanricardorc.daggerillo.presentation.menu.dashboard.DashboardViewModel;
import com.juanricardorc.daggerillo.presentation.menu.home.HomeViewModel;
import com.juanricardorc.daggerillo.presentation.menu.notification.NotificationsViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MenuViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel.class)
    public abstract ViewModel bindDashboardViewModel(DashboardViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    public abstract ViewModel bindHomeViewModel(HomeViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(NotificationsViewModel.class)
    public abstract ViewModel bindNotificationViewModel(NotificationsViewModel viewModel);
}
