package com.example.dagger2java.Network;

import com.example.dagger2java.Basics.Constants;
import com.example.dagger2java.BuildConfig;

import javax.inject.Inject;

public class NetworkConnection {
    private String mEndpoint;

    @Inject
    public NetworkConnection(){

        if(BuildConfig.DEBUG){
            this.mEndpoint= Constants.DEBUG_ENDPOINT;
        }else {
            this.mEndpoint=Constants.PROD_ENDPOINT;
        }

    }
    public String doReq() {
        return this.mEndpoint;
    }

}