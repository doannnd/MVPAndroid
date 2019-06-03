package com.nguyendinhdoan.mvpandroid.base;

import android.view.View;

/**
 * onAttach() and onDetach(). It also handles keeping a reference to Mvp View
 * can be accessed from the children classed by calling getMvpView()
 * @param <V>
 */
public class BasePresenter<V> implements BaseMvpPresenter<V> {

    private V mvpView;

    @Override
    public void onAttach(V mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void onDetach() {
        this.mvpView = null;
    }
}
