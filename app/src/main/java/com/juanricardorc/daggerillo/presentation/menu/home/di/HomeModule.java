package com.juanricardorc.daggerillo.presentation.menu.home.di;

import com.juanricardorc.daggerillo.dependencie.scope.MenuScoped;
import com.juanricardorc.daggerillo.domain.model.UserModel;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule {


    @MenuScoped
    @Provides
    @Named("NameScreen")
    static String getNameScreen() {
        return new String("Home");
    }

    @MenuScoped
    @Provides
    static UserModel gerUser() {
        UserModel userModel = new UserModel();
        userModel.setId("1001");
        userModel.setName("John");
        userModel.setLastName("Richard");
        userModel.setJob("Software Engineer");
        return userModel;
    }
}
