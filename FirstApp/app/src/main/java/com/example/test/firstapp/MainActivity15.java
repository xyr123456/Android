package com.example.test.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity15 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main18);
        View root=this.getLayoutInflater().inflate(R.layout.popup,null);
        final PopupWindow popup=new PopupWindow(root,560,720);
        Button button=(Button) findViewById(R.id.bn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                popup.showAsDropDown(view);
                popup.showAtLocation(findViewById(R.id.bn), Gravity.CENTER,20,20);
            }
        });
        root.findViewById(R.id.close).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        popup.dismiss();
                    }
                }
        );
    }
}
