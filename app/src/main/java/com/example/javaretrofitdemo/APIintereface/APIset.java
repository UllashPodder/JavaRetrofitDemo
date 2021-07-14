package com.example.javaretrofitdemo.APIintereface;


import com.example.javaretrofitdemo.DataModel.PostManResponseModel;
import com.example.javaretrofitdemo.DataModel.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIset {
    @GET("fact")
    Call<ResponseModel> getResult(
//            @Field("name") String name
//            @Field("length") Integer length
    );
    @FormUrlEncoded
    @POST("post")
    Call<PostManResponseModel> getPostResponse(
            @Field("param1") String paramValue1
    );
}
