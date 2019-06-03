package com.nguyendinhdoan.mvpandroid.di.modules;

import android.app.Activity;
import android.content.Context;

import com.nguyendinhdoan.mvpandroid.di.scopes.ActivityScope;
import com.nguyendinhdoan.mvpandroid.main.MainMvpPresenter;
import com.nguyendinhdoan.mvpandroid.main.MainMvpView;
import com.nguyendinhdoan.mvpandroid.main.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private Activity activity;

    public ApplicationModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return activity;
    }

    @Provides
    @ActivityScope
    MainMvpPresenter<MainMvpView> provideMainPresenter(MainPresenter<MainMvpView> presenter) {
        return presenter;
    }
}
