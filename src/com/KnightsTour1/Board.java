package com.KnightsTour1;

import java.util.ArrayList;

public class Board {
    private int curr = 0;
    //private char file ;//a..h
    //int row ;//1..8

    String[][] board = {{"a8","b8","c8","d8","e8","f8","g8","h8"},
                       {"a7","b7","c7","d7","e7","f7","g7","h7"},
                       {"a6","b6","c6","d6","e6","f6","g6","h6"},
                       {"a5","b5","c5","d5","e5","f5","g5","h5"},
                       {"a4","b4","c4","d4","e4","f4","g4","h4"},
                       {"a3","b3","c3","d3","e3","f3","g3","h3"},
                       {"a2","b2","c2","d2","e2","f2","g2","h2"},
                       {"a1","b1","c1","d1","e1","f1","g1","h1"}};

    int[][] board1 = {{0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0}};

    public Board(){
    }



    public int getCurr() {
        return curr;
    }



    public void setCurr(int curr) {
        this.curr = curr;
    }
    public void leftDiamond(){

    }
    public void rightDiamond(){

    }
    public void leftSquare(){

    }
    public void rightSquare(){

    }


    public void knightTour(String pos){
        ArrayList<String> visitados= new ArrayList<String>();
        Knight knight = new Knight();
        String[] rightSquare = {"a7","a3","b5","b1","c8","c4","d6","d2","e7","e3","f5","f1","g8","g4","h6","h2"};
        String[] rightDiamond = {"a5","a1","b7","b3","c6","c2","d8","d4","e5","e1","f7","f3","g6","g2","h8","h4"};
        String[] leftSquare = {"a6","a2","b8","b4","c5","c1","d7","d3","e6","e2","f8","f4","g5","g1","h7","h3"};
        String[] leftDiamond = {"a8","a4","b6","b2","c7","c3","d5","d1","e8","e4","f6","f2","g7","g3","h5","h1"};

        visitados.add(pos);
        knight.setFile(pos.charAt(0) - 97);
        knight.setRow(8 - pos.charAt(1));
        //verificar em qual sistema está o cavalo
        String curr =  board[knight.getFile()][knight.getRow()];

        for(int i = 0; i<rightSquare.length; i++){
            if(pos.equals(rightSquare[i])){
                rightSquare();
                rightDiamond();
                leftSquare();
                leftDiamond();
            }

            if(pos.equals(rightDiamond[i])){
                rightDiamond();
            }

            if(pos.equals(leftSquare[i])){
                leftSquare();
            }

            if(pos.equals(leftDiamond[i])){
                leftDiamond();
            }
        }

        //verificar em qual sistema está o cavalo

        for(int i = 0; i<visitados.size(); i++){

        }
    }
    public void move(String pos){
        Knight knight = new Knight();
        setCurr(curr+1);
        //char file = pos.charAt(0);//a..h
        knight.setFile(pos.charAt(0) - 97);
        //int row = pos.charAt(1);//1..8
        knight.setRow(8 - pos.charAt(1));
        //file -= 97;
        //row = 8 - row;
        //int curr = board1[file][row];

        for(int i = 1; i<64; i++){


            board1[knight.getFile()][knight.getRow()] = i;

            System.out.println(knight.getFile() + knight.getRow()); //converter para chess
        }

        //setFile(file);
        //setRow(row);

        //curr = new char[][]{{file}, {(char) row}};

    }
    public void move1(String pos){
        char piece = pos.charAt(0);
        char file = pos.charAt(1);//a..h
        int row = pos.charAt(2);//1..8

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


        //if (){

       // }
    }
}
