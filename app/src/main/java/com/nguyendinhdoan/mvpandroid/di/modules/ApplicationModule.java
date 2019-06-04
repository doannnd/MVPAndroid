package com.nguyendinhdoan.mvpandroid.di.modules;

import android.content.Context;

import com.nguyendinhdoan.mvpandroid.MvpAndroid;
import com.nguyendinhdoan.mvpandroid.di.qualifiers.ApplicationContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private MvpAndroid app;

    public ApplicationModule(MvpAndroid app) {
        this.app = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return app;
    }

}
