package com.nguyendinhdoan.mvpandroid.di.components;

import com.nguyendinhdoan.mvpandroid.di.modules.ActivityModule;
import com.nguyendinhdoan.mvpandroid.di.scopes.ActivityScope;
import com.nguyendinhdoan.mvpandroid.main.MainActivity;

import dagger.Component;

@Component(
        modules = {ActivityModule.class},
        dependencies = {ApplicationComponent.class}
)
@ActivityScope
public interface ActivityComponent {

    void injectMainActivity(MainActivity mainActivity);

    void injectOtherActivity();
}
