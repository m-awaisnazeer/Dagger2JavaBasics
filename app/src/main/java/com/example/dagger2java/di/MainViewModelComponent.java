package com.example.dagger2java.di;

import com.example.dagger2java.Basics.MainViewModel;

import dagger.Component;

@Component
public interface MainViewModelComponent {

    MainViewModel getMainViewModel();
}
