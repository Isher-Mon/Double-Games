package com.example.doublegames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button a = (Button) findViewById(R.id.KrNol);
        final Button b = (Button) findViewById(R.id.Dice);
        final Button RulA = (Button) findViewById(R.id.RulsD);
        final MainActivity Grand = this;
        View.OnClickListener OCL = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               switch(view.getId()){
                   case R.id.KrNol:
                       Intent w = new Intent(Grand , KN.class);
                       startActivity(w);
                       break;
                   case R.id.Dice:
                       Intent q = new Intent(Grand , D.class);
                       startActivity(q);
                       break;
                   case R.id.RulsD:
                       Intent d = new Intent(Grand , Rusl_KN.class);
                       startActivity(d);
                       break;
               }
            }
        };
        a.setOnClickListener(OCL);
        b.setOnClickListener(OCL);
        RulA.setOnClickListener(OCL);
    }}
