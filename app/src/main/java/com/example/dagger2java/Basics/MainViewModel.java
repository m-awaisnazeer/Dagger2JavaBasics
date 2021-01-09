package com.example.dagger2java.Basics;

import com.example.dagger2java.Network.NetworkClient;

import javax.inject.Inject;

public class MainViewModel {

    private NetworkClient mClient;

    @Inject
    public MainViewModel(NetworkClient networkClient) {
        this.mClient = networkClient;
    }

    public String fetchData(){
        return mClient.fetchData();
    }
}
