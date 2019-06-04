package com.nguyendinhdoan.mvpandroid.di.modules;

import android.app.Activity;
import android.content.Context;

import com.nguyendinhdoan.mvpandroid.MvpAndroid;
import com.nguyendinhdoan.mvpandroid.di.qualifiers.ActivityContext;
import com.nguyendinhdoan.mvpandroid.di.qualifiers.ApplicationContext;
import com.nguyendinhdoan.mvpandroid.di.scopes.ActivityScope;
import com.nguyendinhdoan.mvpandroid.main.MainMvpPresenter;
import com.nguyendinhdoan.mvpandroid.main.MainMvpView;
import com.nguyendinhdoan.mvpandroid.main.MainPresenter;

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
