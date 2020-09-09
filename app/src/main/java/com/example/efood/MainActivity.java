package com.example.efood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn4 = (ImageButton) findViewById(R.id.drinksid);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(MainActivity.this,drinks.class);
                startActivity(i4);
            }
        });


        btn3 = (ImageButton) findViewById(R.id.pizzaid);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MainActivity.this,pizza.class);
                startActivity(i3);
            }
        });


        btn2 = (ImageButton) findViewById(R.id.pastaid);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this,pasta.class);
                startActivity(i2);
            }
        });


        btn = (Button) findViewById(R.id.signup);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,login.class);
                startActivity(i1);
            }
        });
    }
}
