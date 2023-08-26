package com.example.myretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceholder {

    @GET("posts")
    Call<List<Post>> getPosts(@Query("userId") Integer userId);
}
