package com.nguyendinhdoan.mvpandroid.di.components;

import android.app.Activity;

import com.nguyendinhdoan.mvpandroid.MvpAndroid;
import com.nguyendinhdoan.mvpandroid.di.modules.ApplicationModule;
import com.nguyendinhdoan.mvpandroid.di.modules.NetworkModule;
import com.nguyendinhdoan.mvpandroid.di.scopes.ApplicationScope;

import dagger.Component;

@Component(modules = {ApplicationModule.class, NetworkModule.class})
@ApplicationScope
public interface ApplicationComponent {

    void inject(MvpAndroid app);
}
