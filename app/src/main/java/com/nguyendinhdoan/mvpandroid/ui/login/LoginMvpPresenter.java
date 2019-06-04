package com.nguyendinhdoan.mvpandroid.ui.login;

import com.nguyendinhdoan.mvpandroid.base.BaseMvpPresenter;
import com.nguyendinhdoan.mvpandroid.base.BaseMvpView;

public interface LoginMvpPresenter<V extends LoginMvpView> extends BaseMvpPresenter<V> {

    void loginCheck(String email, String password);
}
