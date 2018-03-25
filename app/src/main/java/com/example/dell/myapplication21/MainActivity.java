package com.example.dell.myapplication21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button text1, text2, text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (Button)findViewById(R.id.buttonTextOne);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Text1Activity.class);
                startActivity(i);
            }
        });

        text2 = (Button)findViewById(R.id.buttonTextTwo);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Text2Activity.class);
                startActivity(i);
            }
        });

        text3 = (Button)findViewById(R.id.buttonTextThree);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Text3Activity.class);
                startActivity(i);
            }
        });
    }
}
