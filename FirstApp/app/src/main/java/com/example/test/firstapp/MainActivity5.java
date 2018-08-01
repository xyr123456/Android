package com.example.test.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity5 extends Activity {
    AutoCompleteTextView actv;
    MultiAutoCompleteTextView mauto;

    String[] books=new String[]{
        "java","ajax","xml","workflow","javaee"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main9);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,R.layout.simple_dropdown_item_1line,books);
        actv=findViewById(R.id.auto);
        actv.setAdapter(aa);
        mauto=findViewById(R.id.mauto);
        mauto.setAdapter(aa);
        mauto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
