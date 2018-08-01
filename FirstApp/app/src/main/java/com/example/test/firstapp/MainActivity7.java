package com.example.test.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity7 extends Activity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main11);
        spinner=findViewById(R.id.spinner);
        String[] arr={"孙悟空","猪八戒","唐僧"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.simle_list_item_multiple_choice,arr);
        spinner.setAdapter(adapter);
    }
}
