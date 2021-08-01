package com.example.apicallinfragmetn;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("users/{user}")
    Call<ResponseModel> getUser(@Path("user") String user);
}
