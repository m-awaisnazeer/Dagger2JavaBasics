package com.example.dagger2java.Network;

public class NetworkClient {

    private NetworkConnection mConnection;

    public NetworkClient(NetworkConnection connection) {
        this.mConnection = connection;
    }

    public String fetchData(){
        return mConnection.doReq();
    }
}