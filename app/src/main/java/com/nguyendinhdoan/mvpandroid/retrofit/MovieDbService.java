package com.nguyendinhdoan.mvpandroid.retrofit;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface MovieDbService {

    @GET("tv/popular")
    Call<TvModel> getpopular(@QueryMap Map<String, String> queries);
}
