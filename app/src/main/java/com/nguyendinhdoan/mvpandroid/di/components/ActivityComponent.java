package com.nguyendinhdoan.mvpandroid.di.components;

import com.nguyendinhdoan.mvpandroid.di.scopes.ActivityScope;
import com.nguyendinhdoan.mvpandroid.main.MainActivity;

import dagger.Component;

@Component
@ActivityScope
public interface ActivityComponent {

    void injectMainActivity(MainActivity mainActivity);

    void injectOtherActivity();
}
