package com.example.test.firstapp;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity11 extends TabActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main15);
        TabHost tabHost=getTabHost();
        TabSpec tab1=tabHost.newTabSpec("tab1").setIndicator("已接电话").setContent(R.id.tab01);
        tabHost.addTab(tab1);
        TabSpec tab2=tabHost.newTabSpec("tab2").setIndicator("呼出电话",getResources().getDrawable(R.drawable.blue)).setContent(R.id.tab02);
        tabHost.addTab(tab2);
        TabSpec tab3=tabHost.newTabSpec("tab3").setIndicator("未接电话").setContent(R.id.tab01);
        tabHost.addTab(tab3);
    }
}
