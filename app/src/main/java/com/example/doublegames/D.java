package com.example.doublegames;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import static com.example.doublegames.Dice.whomove;

public class D extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        final Button[] list_but_p1 = new Button[]{(Button) findViewById(R.id.pp11), (Button) findViewById(R.id.pp12), (Button) findViewById(R.id.pp13), (Button) findViewById(R.id.pp14), (Button) findViewById(R.id.pp15)};
        final Button[] list_but_p2 = new Button[]{(Button) findViewById(R.id.pp21), (Button) findViewById(R.id.pp22), (Button) findViewById(R.id.pp23), (Button) findViewById(R.id.pp24), (Button) findViewById(R.id.pp25)};
        final Button[] grp1 = new Button[]{(Button) findViewById(R.id.RP1), (Button) findViewById(R.id.ENDP1)};
        final Button[] grp2 = new Button[]{(Button) findViewById(R.id.RP2), (Button) findViewById(R.id.ENDP2)};
        final Button declear = (Button) findViewById(R.id.Declear);
        final TextView[] cop1 = new TextView[]{(TextView) findViewById(R.id.COP1),(TextView) findViewById(R.id.NUMP1)};
        final TextView[] cop2 = new TextView[]{(TextView) findViewById(R.id.COP2),(TextView) findViewById(R.id.NUMP2)};
        final boolean[] actual_reroll = new boolean[]{false , false , false , false ,false};
        final Dice p1 = new Dice(list_but_p1, grp1 , cop1);
        final Dice p2 = new Dice(list_but_p2, grp2 , cop2);
        begin(p1, p2, declear , whomove);
        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.RP1:
                        if(whomove == 1){
                        p1.Roll(p1 , actual_reroll);}
                        break;
                    case R.id.pp11:
                        if(whomove == 1){
                        onDiceClick(p1, actual_reroll, 0);}
                        break;
                    case R.id.pp12:
                        if(whomove == 1){
                        onDiceClick(p1, actual_reroll, 1);}
                        break;
                    case R.id.pp13:
                        if(whomove == 1){
                        onDiceClick(p1, actual_reroll, 2);}
                        break;
                    case R.id.pp14:
                        if(whomove == 1){
                        onDiceClick(p1, actual_reroll, 3);}
                        break;
                    case R.id.pp15:
                        if(whomove == 1){
                        onDiceClick(p1, actual_reroll, 4);}
                        break;
                    case R.id.ENDP1:
                        if(whomove == 1){
                        whomove = EndTurn(p1 , p2 , declear , whomove , actual_reroll);}
                        break;
                    case R.id.RP2:
                        if(whomove == 2){
                        p2.Roll(p2,actual_reroll);}
                        break;
                    case R.id.pp21:
                        if(whomove == 2){
                        onDiceClick(p2, actual_reroll, 0);}
                        break;
                    case R.id.pp22:
                        if(whomove == 2){
                        onDiceClick(p2, actual_reroll, 1);}
                        break;
                    case R.id.pp23:
                        if(whomove == 2){
                        onDiceClick(p2, actual_reroll, 2);}
                        break;
                    case R.id.pp24:
                        if(whomove == 2){
                        onDiceClick(p2, actual_reroll, 3);}
                        break;
                    case R.id.pp25:
                        if(whomove == 2){
                        onDiceClick(p2, actual_reroll, 4);}
                        break;
                    case R.id.ENDP2:
                        if(whomove == 2){
                            whomove = EndTurn(p2 , p1 , declear , whomove , actual_reroll); }
                        break;


                }
            }

            ;

        };
        for (int i = 0; i < 2; i++) {
            grp1[i].setOnClickListener(listener);
        }
        for (int i = 0; i < 5; i++) {
            list_but_p1[i].setOnClickListener(listener);
        }
        for (int i = 0; i < 5; i++) {
            list_but_p2[i].setOnClickListener(listener);
        }
        for (int i = 0; i < 2; i++) {
            grp2[i].setOnClickListener(listener);
        }
        declear.setOnClickListener(listener);
        declear.setClickable(false);
    }


    public void begin(Dice p1, Dice p2, Button dec , int beginer) {
        if (beginer == 1) {
            dec.setText("Первым ходит:Синий");
            dec.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.blue));
            for (int i = 0; i < 5; i++) {
                p2.pol[i].setClickable(false);
            }
            for (int i = 0; i < 2; i++) {
                p2.gr[i].setClickable(false);
            }
            p1.gr[1].setClickable(false); }
        else if(beginer == 2) {
            dec.setText("Первым ходит:Красный");
            dec.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.Red));
            for (int i = 0; i < 5; i++) {
                p1.pol[i].setClickable(false);
            }
            for (int i = 0; i < 2; i++) {
                p1.gr[i].setClickable(false); }
            p2.gr[1].setClickable(false);
    }}


    public void onDiceClick(Dice P, boolean[] ar, int l ){
        if(ar[l]){
            if(P.pol[0] == findViewById(R.id.pp21)){P.pol[l].setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.Red));}
            else{P.pol[l].setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.blue));}
            ar[l] = false; }
        else {
            P.pol[l].setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.yellow));
            ar[l] = true;}
    }


    public int EndTurn(Dice endmove , Dice start , Button d , int wh , boolean[] rer){
        if(wh == 1){wh = 2;}
        else{wh = 1;}
        endmove.Add(endmove.outing());
        Integer tr = endmove.nump;
        endmove.Num[1].setText(tr.toString());
        endmove.Num[0].setText("0");
        if (d.getText() == "Первым ходит:Синий" || d.getText() == "Ходит:Синий") { d.setText("Ходит:Красный");
            for(int i = 0;i < 5;i++){
                endmove.pol[i].setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.blue));}
            d.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.Red));
            }
        else if(d.getText() == "Первым ходит:Красный" || d.getText() == "Ходит:Красный"){d.setText("Ходит:Синий");
            for(int i = 0;i < 5;i++){
                endmove.pol[i].setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.Red));}
            d.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.blue));}
        for (int i = 0; i < 5; i++) { start.pol[i].setClickable(true); }
        for (int i = 0; i < 2; i++) { start.gr[i].setClickable(true);}
        for (int i = 0; i < 5; i++) { endmove.pol[i].setClickable(false); }
        for (int i = 0; i < 2; i++) { endmove.gr[i].setClickable(false);}
        endmove.gr[0].setText("Бросить");
        for(int i = 0 ; i < 5; i++){
            rer[i] = false;
        }
        for(int i = 0 ; i < 6; i++){
            endmove.puldp[i] = 0;
        }
        for(int i = 0 ; i < 6; i++){
            start.puldp[i] = 0;
        }
        if(start.nump >= 1000 || endmove.nump >= 1000){
            if(wh == 1){
                d.setText("Победил Синий");}
            else{
                d.setText("Победил Красный");}
        d.setClickable(true);
            return 0;
        }
        return wh;
    }
    public void repit(Dice p1, Dice p2 , Button[] Dp1 , Button[] GRp1, TextView[] NUMp1 , Button[] Dp2 , Button[] GRp2, TextView[] NUMp2 , Button rer){
        p1 = new Dice(GRp1 , GRp1 , NUMp1);
        p2 = new Dice(GRp2 , GRp2 , NUMp2);
        begin(p1 , p2 , rer , whomove);
    }
}


