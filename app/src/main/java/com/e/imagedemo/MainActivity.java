package com.e.imagedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   ImageView iv;
   Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.iv);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               iv.setImageResource(R.drawable.dhoni);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setImageResource(R.drawable.abd);
            }
        });



    }
}