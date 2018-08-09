package com.example.test.secondapp;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends Activity {
    EditText ori;
    EditText navigation;
    EditText touch;
    EditText mnc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        ori=findViewById(R.id.ori);
        navigation=findViewById(R.id.navigation);
        touch=findViewById(R.id.touch);
        mnc=findViewById(R.id.mnc);
        Button bn=findViewById(R.id.bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Configuration cfg=getResources().getConfiguration();
                String screen=cfg.orientation==Configuration.ORIENTATION_LANDSCAPE?
                        "横向屏幕":"竖向屏幕";
                String mncCode=cfg.mnc+"";
                String naviName=cfg.navigation==Configuration.NAVIGATION_NONAV?
                        "没有方向控制":
                        cfg.navigation==Configuration.NAVIGATION_WHEEL?"滚轮控制方向":
                        cfg.navigation==Configuration.NAVIGATION_DPAD?"方向键控制方向":"轨迹球控制方向";
                navigation.setText(naviName);
                String touchName=cfg.touchscreen==Configuration.TOUCHSCREEN_NOTOUCH?"无触摸屏":"支持触摸屏";
                ori.setText(screen);
                mnc.setText(mncCode);
                touch.setText(touchName);
            }
        });
    }

    public void changeScreen(View view){
        Configuration config=getResources().getConfiguration();
        if (config.orientation==Configuration.ORIENTATION_LANDSCAPE){
            //设为竖屏
            MainActivity3.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        if (config.orientation==Configuration.ORIENTATION_PORTRAIT){
            //设为横屏
            MainActivity3.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        String screen=newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE?"横向屏幕":"竖向屏幕";
        Toast.makeText(this,"系统屏幕方向发生改变"+"\n修改后的屏幕方向为:"+screen,Toast.LENGTH_LONG).show();
    }
}
