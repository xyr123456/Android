package com.example.test.firstapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

public class MainActivity10 extends Activity {
    CalendarView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main14);
        Button simple=findViewById(R.id.simple);
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(MainActivity10.this,"简单的提示信息",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button bn=findViewById(R.id.bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=new Toast(MainActivity10.this);
                toast.setGravity(Gravity.CENTER,0,0);
                ImageView image=new ImageView(MainActivity10.this);
                image.setImageResource(R.drawable.blue);
                LinearLayout line=new LinearLayout(MainActivity10.this);
                line.addView(image);
                TextView textView=new TextView(MainActivity10.this);
                textView.setText("带图片的提示信息");
                textView.setTextSize(24);
                textView.setTextColor(Color.MAGENTA);
                line.addView(textView);
                toast.setView(line);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });
        cv=findViewById(R.id.calendarView);
        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayOfMonth) {
                Toast.makeText(MainActivity10.this,"你的生日是"+year+"年"+month+"月"+dayOfMonth+"日",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
