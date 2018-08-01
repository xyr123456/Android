package com.example.test.firstapp;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity12 extends Activity {
    static final int NOTIFICATION_ID=0x123;
    NotificationManager nm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main16);
        nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void send(View source){
        Intent intent=new Intent(MainActivity12.this,MainActivity11.class);
        PendingIntent pi=PendingIntent.getActivity(MainActivity12.this,0,intent,0);
        Notification notify=new Notification.Builder(this).setAutoCancel(true).setTicker("有新消息").
                setSmallIcon(R.drawable.blue).setContentTitle("一条新通知").setContentText("Congratulations to you,your salary has rise!")
                .setDefaults(Notification.DEFAULT_SOUND)
                .setWhen(System.currentTimeMillis()).setContentIntent(pi).build();
        nm.notify(NOTIFICATION_ID,notify);
    }

    public void del(View v){
        nm.cancel(NOTIFICATION_ID);
    }
}
