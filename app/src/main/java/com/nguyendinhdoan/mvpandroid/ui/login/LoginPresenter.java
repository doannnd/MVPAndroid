package com.nguyendinhdoan.mvpandroid.ui.login;

import com.nguyendinhdoan.mvpandroid.R;
import com.nguyendinhdoan.mvpandroid.base.BasePresenter;
import com.nguyendinhdoan.mvpandroid.data.data_manager.DataManager;
import com.nguyendinhdoan.mvpandroid.utils.CommonUtils;

import javax.inject.Inject;

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    @Inject
    LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void loginCheck(String email, String password) {
        if (email == null || email.isEmpty()) {
            getMvpView().showError(R.string.empty_email_error);
            return;
        }

        if (!CommonUtils.isEmailVaid(email)) {
            getMvpView().showError(R.string.invalid_email_error);
            return;
        }

        if (password == null || password.isEmpty()) {
            getMvpView().showError(R.string.empty_email_error);
            return;
        }

        getMvpView().showLoading();
        getDataManger().addCurrentUserEmail(email);
    }
}
