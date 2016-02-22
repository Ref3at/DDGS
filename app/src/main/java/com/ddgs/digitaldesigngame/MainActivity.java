package com.ddgs.digitaldesigngame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ddgs.Quiz.Squiz;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3;
    String vv;
    //hello

    List<Squiz> ques = new ArrayList<Squiz>(){};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Squiz squiz = new Squiz();




        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btn1.getId()) {
            Intent i = new Intent(MainActivity.this, DesignBoard.class);
            startActivity(i);
        } else if (v.getId() == btn2.getId()) {
            Intent i = new Intent(MainActivity.this, Learn_Activity.class);
            startActivity(i);
        } else {
            Intent i = new Intent(MainActivity.this, About.class);
            startActivity(i);
        }
    }
}
