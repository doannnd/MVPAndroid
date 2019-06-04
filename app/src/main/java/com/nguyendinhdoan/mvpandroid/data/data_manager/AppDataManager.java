package com.nguyendinhdoan.mvpandroid.data.data_manager;

import android.content.Context;
import android.net.NetworkInfo;

import com.nguyendinhdoan.mvpandroid.data.data_manager.network.NetworkHelper;
import com.nguyendinhdoan.mvpandroid.di.qualifiers.ApplicationContext;

import javax.inject.Inject;

public class AppDataManager implements DataManager{

    @Inject
    public AppDataManager(@ApplicationContext Context context, NetworkHelper networkHelper) {

    }
}
