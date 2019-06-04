package com.nguyendinhdoan.mvpandroid.di.modules;

import android.app.Activity;
import android.content.Context;

import com.nguyendinhdoan.mvpandroid.di.qualifiers.ActivityContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return activity;
    }
}
