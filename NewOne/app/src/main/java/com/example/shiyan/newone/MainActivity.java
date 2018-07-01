package com.example.shiyan.newone;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnyes;
    Button btnno;
    LinearLayout linear;
    TextView text1;
    TextView text2;

    AlertDialog alert;
    AlertDialog.Builder builer;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        init();
        btnyes.setOnClickListener(this);
        btnno.setOnClickListener(this);


    }

    public void init(){
        context = MainActivity.this;
        btnyes = (Button) findViewById(R.id.btnyes);
        btnno = (Button) findViewById(R.id.btnno);
        linear = (LinearLayout) findViewById(R.id.linear);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.txt2);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnyes:
                linear.setBackgroundResource(R.drawable.happy);
                text1.setVisibility(View.INVISIBLE);
                text2.setText("我已经感觉到你了你内心的想法，我也爱你");
                text2.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
                text2.setTextColor(Color.RED);

                alert = null;
                builer = new AlertDialog.Builder(context);
                builer.setCancelable(false);
                alert = builer.setIcon(R.mipmap.cat)
                        .setTitle("爱你")
                        .setMessage("永远都要跟着自己内心的想法去走")
                        .setPositiveButton("是的", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                alert = null;
                                alert = builer.setTitle("爱我")
                                        .setMessage("就像你爱我一样，要永远爱着我")
                                        .setPositiveButton("我会的", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                alert = builer.setTitle("誓言")
                                                        .setMessage("好，我发誓，我会永远永远爱你！否则我会天打雷劈，不得好死")
                                                        .setPositiveButton("发誓", new DialogInterface.OnClickListener() {
                                                            @Override
                                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                                Toast.makeText(getApplicationContext(),"发誓成功！对方已收到",Toast.LENGTH_SHORT).show();
                                                            }
                                                        }).create();
                                                alert.show();
                                            }
                                        }).create();
                                alert.show();
                            }
                        }).create();
                alert.show();
                break;
            case R.id.btnno:
                linear.setBackgroundResource(R.drawable.unhappy);
                text1.setVisibility(View.INVISIBLE);
                text2.setText("你这就有些虚伪了，明明想做我女朋友！！！");
                text2.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);

                break;

        }
    }
}
