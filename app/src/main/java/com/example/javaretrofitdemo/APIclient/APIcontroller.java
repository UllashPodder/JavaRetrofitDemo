package com.example.javaretrofitdemo.APIclient;

import com.example.javaretrofitdemo.APIintereface.APIset;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIcontroller {//https://postman-echo.com/post https://catfact./ninja
    private static final String base_url = "https://postman-echo.com/";
    private static APIcontroller clientObject;
    private static Retrofit retrofit;

    public APIcontroller() {
        retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
    public static synchronized APIcontroller getInstance(){
        if (clientObject == null)
            clientObject = new APIcontroller();
        return clientObject;
    }
    public APIset getAPI(){
        return retrofit.create(APIset.class);
    }
}
