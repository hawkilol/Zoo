package com.KnightsTour01;

import java.util.ArrayList;

public class Knight {

    private int file;
    private int row;
    protected  int[] x= {2, 1, -1 ,-2 ,-2 ,-1 ,1 ,2};
    protected int[][] lMoves= {{-2,+1} ,{-2,-1} ,{+2,+1} ,{+2,-1} ,{+1,+2} ,{-1,+2} ,{+1,-2} ,{-1,-2}};
    //protected int[][] lMoves= {{-2,+1} ,{-2,-1} ,{+2,+1} ,{+2,-1} ,{+1,+2} ,{-1,+2} ,{+1,-2} ,{-1,-2}};// formato {{file,row} ,{file,row},...}
    protected int[] y= {1, 2 ,2 ,1, -1, -2 , -2 , -1};
    public Knight(){
        //ArrayList<void> L = new ArrayList<>();

    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    //Left / file -2 / row +1 or row -1
//Left1 / file -2 / row +1
//Left2 / file -2 / row -1

//Direita / flie +2 / row +1 or row -1
//Direita1 / flie +2 / row +1
//Direita2 / flie +2 / row -1

//Cima / row +2 / file +1 or file -1
//Cima1 / row +2 / file +1
//Cima2 / row +2 / file -1

//Baixo / row -2 / file +1 or file -1
//Baixo1 / row -2 / file +1
//Baixo2 / row -2 / file -1
    public void left1(){
        this.file -=2;
        this.row +=1;
    }
    public void left2(){
        this.file -=2;
        this.row -=1;
    }
    public void right1(){
        this.file +=2;
        this.row +=1;
    }
    public void right2(){
        this.file +=2;
        this.row -=1;
    }
    public void up1(){
        this.file +=1;
        this.row +=2;
    }
    public void up2(){
        this.file -=1;
        this.row +=2;
    }
    public void down1(){
        this.file +=1;
        this.row -=2;
    }
    public void down2(){
        this.file -=1;
        this.row -=2;
    }
    public void possible(int i){


        left1();
        left2();
        right1();
        right2();
        up1();
        up2();
        down1();
        down2();
    }
    public void backTrack(){



    }

    public void move(String pos){
        char piece = pos.charAt(0);
        char file = pos.charAt(1);//a..h
        int row = pos.charAt(2);//1..8


//Esquerda / file -2 / row +1 or row -1
//Direita / flie +2 / row +1 or row -1
//Cima / row +2 / file +1 or file -1
//Baixo / row -2 / file +1 or file -1
      //  if (){

      //  }
    }

    public int[][] getlMoves() {
        return lMoves;
    }


    public void move1(String pos){
        char file = pos.charAt(0);//a..h
        int row = pos.charAt(1);//1..8

    }
    public void knightTour(String pos){
        ArrayList<String> visitados= new ArrayList<String>();
        visitados.add(pos);
        for(int i = 0; i<visitados.size(); i++){

        }
    }
}
