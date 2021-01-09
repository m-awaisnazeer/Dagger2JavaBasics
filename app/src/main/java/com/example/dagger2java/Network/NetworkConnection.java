package com.example.dagger2java.Network;

import com.example.dagger2java.Basics.Constants;
import com.example.dagger2java.BuildConfig;

public class NetworkConnection {
    private String mEndpoint;

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