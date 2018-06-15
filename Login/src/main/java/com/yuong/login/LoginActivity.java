package com.yuong.login;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yuong.base.activity.BaseActivity;

@Route(path="/login/LoginActivity")
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.button) {
            ARouter.getInstance().build("/main/MainActivity").navigation();
            finish();

        } else if (i == R.id.button2) {
            ARouter.getInstance().build("/shop/ShopActivity").navigation();

        }
    }



}
