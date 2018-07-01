package com.example.shiyan.newone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Administrator on 2018/7/1.
 */

public class Main2 extends AppCompatActivity {
    private ListView listview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        listview = (ListView) findViewById(R.id.listview1);
        
    }
}
