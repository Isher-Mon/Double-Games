package com.example.doublegames;

public  class Pole {
    public static int [][] pole = new int[3][3];
    public static int turn;
    public Pole(){
        for(int i = 0;i < 3;i++){
            for(int l = 0;l < 3;l++){
                pole[i][l] = 0;
            }
        }turn = 1 + (int) (Math.random() * 2);
    }
    public int check(int p[][]){
        int r = 0;
        for(int i = 0; i < 3; i++){
            if((p[i][0] == p[i][1] && p[i][1] == p[i][2]) && p[i][0] > 0){
                return p[i][0];
            }}
        for(int i = 0; i < 3; i++){
            if((p[0][i] == p[1][i] && p[1][i] == p[2][i]) && p[0][i] > 0){
                return p[0][i];} }

        if((p[0][0] == p[1][1] && p[1][1] == p[2][2]) || (p[0][2] == p[1][1] && p[1][1] == p[2][0])){
            if((p[0][0] == 1 && p[0][0] == p[1][1] && p[1][1] == p[2][2]) || (p[0][2] == 1 && p[0][2] == p[1][1] && p[1][1] == p[2][0])){
                return 1;
            }
            else if((p[0][0] == 2 && p[0][0] == p[1][1] && p[1][1] == p[2][2]) || (p[0][2] == 2 && p[0][2] == p[1][1] && p[1][1] == p[2][0])){
                return 2;
            }
        }
        return r;
    }
}