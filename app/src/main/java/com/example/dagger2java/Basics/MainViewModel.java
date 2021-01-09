package com.example.dagger2java.Basics;

import com.example.dagger2java.Network.NetworkClient;

public class MainViewModel {

    private NetworkClient mClient;

    public MainViewModel(NetworkClient networkClient) {
        this.mClient = networkClient;
    }

    public String fetchData(){
        return mClient.fetchData();
    }
}
