package com.example.administrator.news.base;

import android.app.Application;

import cn.bmob.v3.Bmob;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, "593468dde4afd0479ab5d207d40a3fd8");
    }
}
