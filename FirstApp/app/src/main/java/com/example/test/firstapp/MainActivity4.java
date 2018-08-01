package com.example.test.firstapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class MainActivity4 extends Activity{
    ListView myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main8);
        myList=(ListView)findViewById(R.id.myList);
        BaseAdapter adapter=new BaseAdapter() {
            @Override
            public int getCount() {
                return 40;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int position, View view, ViewGroup viewGroup) {
                LinearLayout line=new LinearLayout(MainActivity4.this);
                line.setOrientation(LinearLayout.HORIZONTAL);
                ImageView image=new ImageView(MainActivity4.this);
                image.setImageResource(R.drawable.blue);
                TextView text=new TextView(MainActivity4.this);
                text.setText("第"+(position+1)+"个列表项");
                text.setTextSize(20);
                text.setTextColor(Color.RED);
                line.addView(image);
                line.addView(text);
                return line;
            }
        };
        myList.setAdapter(adapter);
    }
}
