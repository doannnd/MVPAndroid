package com.nguyendinhdoan.mvpandroid.di.components;

import com.nguyendinhdoan.mvpandroid.di.modules.ActivityModule;
import com.nguyendinhdoan.mvpandroid.di.scopes.ActivityScope;
import com.nguyendinhdoan.mvpandroid.ui.login.LoginActivity;
import com.nguyendinhdoan.mvpandroid.ui.main.MainActivity;

import dagger.Component;

@Component(
        modules = {ActivityModule.class},
        dependencies = {ApplicationComponent.class}
)
@ActivityScope
public interface ActivityComponent {

    void injectMainActivity(MainActivity mainActivity);

    void injectLoginActivity(LoginActivity loginActivity);

    void injectMainActivity2(Main2Activity main2Activity);
}
