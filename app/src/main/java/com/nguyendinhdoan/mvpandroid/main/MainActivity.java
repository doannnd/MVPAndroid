package com.nguyendinhdoan.mvpandroid.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nguyendinhdoan.mvpandroid.R;
import com.nguyendinhdoan.mvpandroid.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainMvpView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
