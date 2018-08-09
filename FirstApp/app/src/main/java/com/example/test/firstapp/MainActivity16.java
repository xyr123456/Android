package com.example.test.firstapp;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity16 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main18);
        Button dataBn=findViewById(R.id.bn);
        Button timeBn=findViewById(R.id.close);
        dataBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c=Calendar.getInstance();
                new DatePickerDialog(MainActivity16.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        EditText show=findViewById(R.id.show);
                        show.setText("您选择了："+year+"年"+(month+1)+"月"+dayOfMonth+"日");
                    }
                },c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        timeBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c=Calendar.getInstance();
                new TimePickerDialog(MainActivity16.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourofDay, int minute) {
                        EditText show=findViewById(R.id.show);
                        show.setText("您选择了:"+hourofDay+"时"+minute+"分");
                    }
                },c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),true).show();
            }
        });
    }
}
