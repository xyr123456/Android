package com.example.test.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity9 extends Activity {
    int[] imageIds=new int[]{
      R.drawable.btn_plus,R.drawable.btn_minus,R.drawable.blue
      ,R.drawable.blue,R.drawable.btn_minus,R.drawable.btn_plus
      ,R.drawable.btn_plus,R.drawable.blue,R.drawable.btn_minus
      ,R.drawable.blue,R.drawable.btn_plus,R.drawable.btn_minus
    };
    ImageSwitcher switcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main13);
        List<Map<String,Object>> listItems=new ArrayList<>();
        for (int i=0;i<imageIds.length;i++){
            Map<String,Object> listItem=new HashMap<>();
            listItem.put("image",imageIds[i]);
            listItems.add(listItem);
        }
        switcher=findViewById(R.id.switcher);
        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(MainActivity9.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,listItems,R.layout.cell,new String[]{"image"},new int[]{R.id.image1});
        GridView grid=findViewById(R.id.grid01);
        grid.setAdapter(simpleAdapter);
        grid.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switcher.setImageResource(imageIds[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switcher.setImageResource(imageIds[i]);
            }
        });
    }
}
