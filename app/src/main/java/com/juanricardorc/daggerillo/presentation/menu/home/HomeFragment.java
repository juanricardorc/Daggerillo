package com.juanricardorc.daggerillo.presentation.menu.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.juanricardorc.daggerillo.R;
import com.juanricardorc.daggerillo.dependencie.viewmodel.ViewModelProviderFactory;
import com.juanricardorc.daggerillo.domain.model.UserModel;
import com.juanricardorc.daggerillo.presentation.app.BaseFragment;

import javax.inject.Inject;

public class HomeFragment extends BaseFragment {

    private HomeViewModel homeViewModel;

    @Inject
    UserModel userModel;

    @Inject
    ViewModelProviderFactory viewModelProviderFactory;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        homeViewModel = new ViewModelProvider(getParentFragment().getViewModelStore(), viewModelProviderFactory).get(HomeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s + " " + userModel.getName() + " " + userModel.getJob());
            }
        });
        return root;
    }
}
