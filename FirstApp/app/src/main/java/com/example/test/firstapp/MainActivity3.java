package com.example.test.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.QuickContactBadge;

public class MainActivity3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main7);
        ListView list1=(ListView)findViewById(R.id.list1);
        String[] arr1={"孙悟空","猪八戒","牛魔王"};
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,R.layout.array_item,arr1);
        list1.setAdapter(adapter1);
        ListView list2=(ListView)findViewById(R.id.list2);

        String[] arr2={"Java","Hibernate","Spring","Android"};
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this,R.layout.checked_item,arr2);
        list2.setAdapter(adapter2);
    }
}