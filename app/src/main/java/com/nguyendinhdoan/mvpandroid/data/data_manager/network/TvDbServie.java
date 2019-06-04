package com.nguyendinhdoan.mvpandroid.data.data_manager.network;

import com.nguyendinhdoan.mvpandroid.data.model.TvModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface TvDbServie {

    @GET("tv/popular")
    Call<TvModel> getpopular(@QueryMap Map<String, String> queries);
}
