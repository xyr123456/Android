package com.example.test.firstapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity18 extends Activity {
    final int FONT_10=0X111;
    final int FONT_12=0x112;
    final int FONT_14=0x113;
    final int FONT_16=0x114;
    final int FONT_18=0x115;

    final int PLAIN_ITEM=0x11b;

    final int FONT_RED=0x116;
    final int FONT_BLUE=0x117;
    final int FONT_GREEN=0x118;
    private EditText edit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main20);
        edit=findViewById(R.id.txt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu fontMenu=menu.addSubMenu("字体大小");
        fontMenu.setIcon(R.drawable.blue);
        fontMenu.setHeaderIcon(R.drawable.blue);
        fontMenu.setHeaderTitle("选择字体大小");
        fontMenu.add(0,FONT_10,0,"10号字体");
        fontMenu.add(0,FONT_12,0,"12号字体");
        fontMenu.add(0,FONT_14,0,"14号字体");
        fontMenu.add(0,FONT_16,0,"16号字体");
        fontMenu.add(0,FONT_18,0,"18号字体");
        menu.add(0,PLAIN_ITEM,0,"普通菜单项");

        SubMenu colorMenu=menu.addSubMenu("字体颜色");
        colorMenu.setIcon(R.drawable.btn_minus);
        colorMenu.setHeaderIcon(R.drawable.btn_minus);
        colorMenu.setHeaderTitle("选择文字颜色");
        colorMenu.add(0,FONT_RED,0,"红色");
        colorMenu.add(0,FONT_GREEN,0,"绿色");
        colorMenu.add(0,FONT_BLUE,0,"蓝色");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case FONT_10:
                edit.setTextSize(10*2);
                break;
            case FONT_12:
                edit.setTextSize(12*2);
            case FONT_14:
                edit.setTextSize(14*2);
                break;
            case FONT_16:
                edit.setTextSize(16*2);
                break;
            case FONT_18:
                edit.setTextSize(18*2);
                break;
            case FONT_RED:
                edit.setTextColor(Color.RED);
                break;
            case FONT_GREEN:
                edit.setTextColor(Color.GREEN);
                break;
            case FONT_BLUE:
                edit.setTextColor(Color.BLUE);
                break;
            case PLAIN_ITEM:
                Toast toast=Toast.makeText(MainActivity18.this,"您单击了普通菜单项",Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
        return true;
    }
}
