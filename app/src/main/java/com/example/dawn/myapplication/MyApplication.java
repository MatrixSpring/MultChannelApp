package com.example.dawn.myapplication;

import android.app.Application;
import android.util.Log;

import com.meituan.android.walle.WalleChannelReader;
import com.umeng.commonsdk.UMConfigure;

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        initUMengChannel();
    }

    private void initUMengChannel() {
        //  获取walle的渠道号
        String channel = WalleChannelReader.getChannel(this.getApplicationContext());
        Log.d("initUMengChannel", "initUMengChannel : "+channel);
        // 获取渠道号以后设置到友盟中
        UMConfigure.init(this, "5386fcc256240be6cf00c687", channel, UMConfigure.DEVICE_TYPE_PHONE, "1fe6a20054bcef865eeb0991ee84525b");

    }
}
