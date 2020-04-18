package com.juanricardorc.daggerillo.presentation.menu.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.juanricardorc.daggerillo.dependencie.viewmodel.ViewModelProviderFactory;

import javax.inject.Inject;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    @Inject
    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}