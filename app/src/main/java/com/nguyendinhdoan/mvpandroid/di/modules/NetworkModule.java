package com.nguyendinhdoan.mvpandroid.di.modules;

import com.nguyendinhdoan.mvpandroid.di.scopes.ActivityScope;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    @Provides
    @ActivityScope
    Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

