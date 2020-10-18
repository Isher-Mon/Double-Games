package com.example.doublegames;

import android.widget.Button;
import android.widget.TextView;


public  class Dice {
    public int[] puldp;
    public Button[] pol;
    public int nump;
    Button[] gr;
    TextView[] Num;
    public static int whomove = 1 + (int) (Math.random() * 2);
    final int combone[][] = {{100, 200, 1000}, {20, 40, 200}, {30, 60, 300}, {40, 80, 400}, {50, 100, 500}, {60, 120, 600}};


    public Dice(Button[] now , Button[] p , TextView[] v) {
        Num = v;
        puldp = new int[]{0, 0, 0, 0, 0, 0};
        pol = now;
        gr = p;
        nump = 0;

    }
    public void Roll(Dice P ,boolean[] rer){
        if(P.gr[0].getText() == "Перебросить"){
            for(int i = 0;i < 5;i++){
                if(rer[i]){
                    Integer nol = new Integer(String.valueOf(P.pol[i].getText()));
                    P.puldp[nol - 1]--;
                    Integer num = 1 + (int) (Math.random() * 6);
                    P.puldp[num - 1] += 1;
                    P.pol[i].setText(num.toString());
                }
            }
            P.gr[0].setClickable(false);
            for (int i = 0; i < 5; i++) { P.pol[i].setClickable(false); }
            Integer o = P.outing();
            P.Num[0].setText(o.toString());
        }
        else{
        for (int i = 0; i < 5; i++) {
            Integer num = 1 + (int) (Math.random() * 6);
            P.puldp[num - 1] += 1;
            P.pol[i].setText(num.toString()); }
        P.gr[0].setText("Перебросить");
        Integer o = P.outing();
        P.Num[0].setText(o.toString());}
    }



    public int outing() {
        int k = 0;
        for (int i = 0; i < 6; i++) {
            if (puldp[i] >= 3) {
                k = combone[i][puldp[i] - 3];
                nump += combone[i][puldp[i] - 3];
                puldp[i] = 0; }
            else if(puldp[0] == 1 && puldp[1] == 1 && puldp[2] == 1 && puldp[3] == 1 && puldp[4] == 1){
                k += 125;
                nump += 125; }
        else if(puldp[1] == 1 && puldp[2] == 1 && puldp[3] == 1 && puldp[4] == 1 && puldp[5] == 1){
            k += 250;
            nump += 250;
            }}
        return k;
    }
    protected void Add(int num){
        nump += num;
    }
    public boolean checlist(Button[] chec, Button gl) {
        for (int i = 0; i < chec.length; i++) {
            if (gl == chec[i]) {
                return true;
            }
        }
        return false;
    }
    }

