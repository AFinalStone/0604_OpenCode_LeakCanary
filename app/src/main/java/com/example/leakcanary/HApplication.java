package com.example.leakcanary;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class HApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
