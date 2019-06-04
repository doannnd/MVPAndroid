package com.nguyendinhdoan.mvpandroid.ui.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.nguyendinhdoan.mvpandroid.R;
import com.nguyendinhdoan.mvpandroid.base.BaseActivity;
import com.nguyendinhdoan.mvpandroid.ui.main.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginMvpView {

    @Inject
    LoginMvpPresenter<LoginMvpView> loginMvpPresenter;

    @BindView(R.id.email)
    EditText email;

    @BindView(R.id.password)
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getActivityComponent().injectLoginActivity(this);
        ButterKnife.bind(this);
        loginMvpPresenter.onAttach(this);
    }

    @OnClick(R.id.signup)
    void confirmSignUp() {
        loginMvpPresenter.loginCheck(email.getText().toString(), password.getText().toString());
    }

    @Override
    public void openMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
    }
}
