package com.example.doublegames;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KN extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_n);
        final ImageButton l1 = (ImageButton)findViewById(R.id.l1);
        final ImageButton l2 = (ImageButton)findViewById(R.id.l2);
        final ImageButton l3 = (ImageButton)findViewById(R.id.l3);
        final ImageButton l4 = (ImageButton)findViewById(R.id.l4);
        final ImageButton l5 = (ImageButton)findViewById(R.id.l5);
        final ImageButton l6 = (ImageButton)findViewById(R.id.l6);
        final ImageButton l7 = (ImageButton)findViewById(R.id.l7);
        final ImageButton l8 = (ImageButton)findViewById(R.id.l8);
        final ImageButton l9 = (ImageButton)findViewById(R.id.l9);
        final Button b = (Button)findViewById(R.id.button);
        final TextView rez = (TextView)findViewById(R.id.textView);
        final TextView ogl = (TextView)findViewById(R.id.textView2);
        b.setText("Заново");
        final Pole a = new Pole();
        if(a.turn == 1){ rez.setText("Нолики"); }
        else{rez.setText("Крестики");}
        final View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v){
                switch(v.getId()){
                    case R.id.l1:
                        if(a.turn % 2 == 0) {
                            l1.setBackgroundResource(R.drawable.kr);
                            a.pole[0][0] = 1;}
                        else{
                            l1.setBackgroundResource(R.drawable.no);
                            a.pole[0][0] = 2;    }
                        a.turn++;
                        if(a.check(a.pole) > 0){ HaveWiner(a.check(a.pole) , ogl , rez,l1,l2,l3,l4,l5,l6,l7,l8,l9,b); }
                        l1.setClickable(false);
                        break;
                    case R.id.l2:
                        if(a.turn % 2 == 0) {
                            l2.setBackgroundResource(R.drawable.kr);
                            a.pole[0][1] = 1;}
                        else{
                            l2.setBackgroundResource(R.drawable.no);
                            a.pole[0][1] = 2;    }
                        a.turn++;
                        if(a.check(a.pole) > 0){ HaveWiner(a.check(a.pole) , ogl , rez,l1,l2,l3,l4,l5,l6,l7,l8,l9,b); }
                        l2.setClickable(false);
                        break;
                    case R.id.l3:
                        if(a.turn % 2 == 0) {
                            l3.setBackgroundResource(R.drawable.kr);
                            a.pole[0][2] = 1;}
                        else{
                            l3.setBackgroundResource(R.drawable.no);
                            a.pole[0][2] = 2;    }
                        a.turn++;
                        if(a.check(a.pole) > 0){ HaveWiner(a.check(a.pole) , ogl , rez,l1,l2,l3,l4,l5,l6,l7,l8,l9,b); }
                        l3.setClickable(false);
                        break;
                    case R.id.l4:
                        if(a.turn % 2 == 0) {
                            l4.setBackgroundResource(R.drawable.kr);
                            a.pole[1][0] = 1;}
                        else{
                            l4.setBackgroundResource(R.drawable.no);
                            a.pole[1][0] = 2;    }
                        a.turn++;
                        if(a.check(a.pole) > 0){ HaveWiner(a.check(a.pole) , ogl , rez,l1,l2,l3,l4,l5,l6,l7,l8,l9,b); }
                        l4.setClickable(false);
                        break;
                    case R.id.l5:
                        if(a.turn % 2 == 0) {
                            l5.setBackgroundResource(R.drawable.kr);
                            a.pole[1][1] = 1;}
                        else{
                            l5.setBackgroundResource(R.drawable.no);
                            a.pole[1][1] = 2;    }
                        a.turn++;
                        if(a.check(a.pole) > 0){ HaveWiner(a.check(a.pole) , ogl , rez,l1,l2,l3,l4,l5,l6,l7,l8,l9,b); }
                        l5.setClickable(false);
                        break;
                    case R.id.l6:
                        if(a.turn % 2 == 0) {
                            l6.setBackgroundResource(R.drawable.kr);
                            a.pole[1][2] = 1;}
                        else{
                            l6.setBackgroundResource(R.drawable.no);
                            a.pole[1][2] = 2;    }
                        a.turn++;
                        if(a.check(a.pole) > 0){ HaveWiner(a.check(a.pole) , ogl , rez,l1,l2,l3,l4,l5,l6,l7,l8,l9,b); }
                        l6.setClickable(false);
                        break;
                    case R.id.l7:
                        if(a.turn % 2 == 0) {
                            l7.setBackgroundResource(R.drawable.kr);
                            a.pole[2][0] = 1;}
                        else{
                            l7.setBackgroundResource(R.drawable.no);
                            a.pole[2][0] = 2;    }
                        a.turn++;
                        if(a.check(a.pole) > 0){ HaveWiner(a.check(a.pole) , ogl , rez,l1,l2,l3,l4,l5,l6,l7,l8,l9,b); }
                        l7.setClickable(false);
                        break;
                    case R.id.l8:
                        if(a.turn % 2 == 0) {
                            l8.setBackgroundResource(R.drawable.kr);
                            a.pole[2][1] = 1;}
                        else{
                            l8.setBackgroundResource(R.drawable.no);
                            a.pole[2][1] = 2;    }
                        a.turn++;
                        if(a.check(a.pole) > 0){ HaveWiner(a.check(a.pole) , ogl , rez,l1,l2,l3,l4,l5,l6,l7,l8,l9,b); }
                        l8.setClickable(false);
                        break;
                    case R.id.l9:
                        if(a.turn % 2 == 0) {
                            l9.setBackgroundResource(R.drawable.kr);
                            a.pole[2][2] = 1;}
                        else{
                            l9.setBackgroundResource(R.drawable.no);
                            a.pole[2][2] = 2;    }
                        a.turn++;
                        if(a.check(a.pole) > 0){ HaveWiner(a.check(a.pole) , ogl , rez,l1,l2,l3,l4,l5,l6,l7,l8,l9,b); }
                        l9.setClickable(false);
                        break;
                    case R.id.button:
                        l1.setBackgroundColor(Color.WHITE);
                        l2.setBackgroundColor(Color.WHITE);
                        l3.setBackgroundColor(Color.WHITE);
                        l4.setBackgroundColor(Color.WHITE);
                        l5.setBackgroundColor(Color.WHITE);
                        l6.setBackgroundColor(Color.WHITE);
                        l7.setBackgroundColor(Color.WHITE);
                        l8.setBackgroundColor(Color.WHITE);
                        l9.setBackgroundColor(Color.WHITE);
                        Pole a = new Pole();
                        ogl.setText("Первыми ходят:");
                        if(a.turn == 1){ rez.setText("Нолики"); }
                        else{rez.setText("Крестики");}
                        b.setBackgroundColor(Color.parseColor("#F44336"));
                        b.setText("Заново");
                        l1.setClickable(true);
                        l2.setClickable(true);
                        l3.setClickable(true);
                        l4.setClickable(true);
                        l5.setClickable(true);
                        l6.setClickable(true);
                        l7.setClickable(true);
                        l8.setClickable(true);
                        l9.setClickable(true);

                }
            }
        };
        l1.setOnClickListener(listener);
        l2.setOnClickListener(listener);
        l3.setOnClickListener(listener);
        l4.setOnClickListener(listener);
        l5.setOnClickListener(listener);
        l6.setOnClickListener(listener);
        l7.setOnClickListener(listener);
        l8.setOnClickListener(listener);
        l9.setOnClickListener(listener);
        b.setOnClickListener(listener);
    }
    public void HaveWiner(int a , TextView v1 , TextView v2 , ImageButton l1 ,  ImageButton l2 ,  ImageButton l3 ,  ImageButton l4 ,  ImageButton l5 ,  ImageButton l6 ,  ImageButton l7 , ImageButton l8, ImageButton l9 , Button b){
        v1.setText("У нас есть победитель !");
            if(a == 1){
                v2.setText("Крестики");
            }
            else{v2.setText("Нолики");}

        l1.setClickable(false);
        l2.setClickable(false);
        l3.setClickable(false);
        l4.setClickable(false);
        l5.setClickable(false);
        l6.setClickable(false);
        l7.setClickable(false);
        l8.setClickable(false);
        l9.setClickable(false);
        b.setBackgroundColor(Color.parseColor("#03A9F4"));
        b.setText("Еще паритию");
        b.setClickable(true);

    }

}