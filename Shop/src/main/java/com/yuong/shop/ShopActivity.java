package com.yuong.shop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yuong.base.activity.BaseActivity;

@Route(path="/shop/ShopActivity")
public class ShopActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
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
            ARouter.getInstance().build("/login/LoginActivity").navigation();

        }
    }
}
