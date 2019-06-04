package com.nguyendinhdoan.mvpandroid;

import android.app.Application;
import android.net.Network;

import com.nguyendinhdoan.mvpandroid.di.components.ApplicationComponent;
import com.nguyendinhdoan.mvpandroid.di.modules.ApplicationModule;
import com.nguyendinhdoan.mvpandroid.di.modules.NetworkModule;

public class MvpAndroid extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .networkModule(new NetworkModule())
                .applicationModule(new ApplicationModule(this))
                .build();

        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
