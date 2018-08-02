package com.example.test.firstapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity13 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main16);
    }

    public void customView(View source){
        TableLayout loginForm=(TableLayout)getLayoutInflater().inflate(R.layout.login,null);
        new AlertDialog.Builder(this).setIcon(R.drawable.blue).setTitle("自定义View对话框").setView(loginForm)
                .setPositiveButton("登录", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast=Toast.makeText(MainActivity13.this,"恭喜你成功登录",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast toast=Toast.makeText(MainActivity13.this,"取消登录成功",Toast.LENGTH_SHORT);
                toast.show();
            }
        }).create().show();
    }
}
