package com.nguyendinhdoan.mvpandroid.base;

import android.view.View;

public interface BaseMvpPresenter<V> {

    void onAttach(V mvpView);

    void onDetach();
}
