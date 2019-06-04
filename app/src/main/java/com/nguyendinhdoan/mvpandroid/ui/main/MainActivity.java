package com.nguyendinhdoan.mvpandroid.ui.main;

import android.os.Bundle;

import com.nguyendinhdoan.mvpandroid.R;
import com.nguyendinhdoan.mvpandroid.base.BaseActivity;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainActivity extends BaseActivity implements MainMvpView {

    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().injectMainActivity(this);

        if (isNetworkAvailable()) {

        }
    }
}
