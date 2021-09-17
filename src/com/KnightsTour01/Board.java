package com.KnightsTour01;

import java.util.Arrays;

public class Board extends Knight {

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
    public boolean valid(int nextRow, int nextFile, int[][] board1){
        if(nextFile <=7 && nextRow<=7 && nextFile >= 0  && nextRow>=0 && board1[nextRow][nextFile] == 0){
            return true;
        }
        return false;

    }


    public boolean knightTour(int currRow, int currFile, int[][] L, int move){
        //System.out.println(board[currRow][currFile]);
        //System.out.println("Move: "+move);
        //int nextFile;
        //int nextRow;
        int Return = 0;
        int tempMove;
        int tempFile;
        int tempRow;
        //move+=1;

        for(int i = 0; i<L.length; ++i){


            if (move >= 64){
                System.out.println("pag");
                return true;
            }
            int nextRow = currRow + L[i][1];
            int nextFile = currFile + L[i][0];
            //int nextRow = currRow + x[i];
            //int nextFile = currFile + y[i];

            //if (move == 44 || move == 45 ) {
           //     System.out.println("NextFile"+nextFile);
           //     System.out.println("currFile"+currFile);
           //     System.out.println("NextRow"+nextRow);
            //    System.out.println("currRow"+currRow);
           // }

           // if(nextFile <=7 && nextRow<=7 && nextFile >= 0  && nextRow>=0 && board1[nextRow][nextFile] == 0){
            if(nextRow < 8 && nextRow >= 0 && nextFile < 8 && nextFile >= 0 && board1[nextRow][nextFile] == 0){

                board1[nextRow][nextFile] = move;
                tempRow = currRow;
                tempFile = currFile;
                //tempRow = nextRow;
                //tempFile = nextFile;

                //move+=1;
                tempMove = move;
                //Verifica se o proximo do proximo é valido
                if(knightTour(nextRow, nextFile, L, move + 1)){

                    System.out.println("!true!");
                    return true;
                    //break;

                }
                System.out.println("!0!");
                System.out.println(move);

                board1[nextRow][nextFile] = 0;
                System.out.println("nextRow: "+nextRow);
                System.out.println("nextFile: "+nextFile);
            }
        }
        return false;
    }
    public void tour(String pos){
        Knight knight = new Knight();
        int currFile = pos.charAt(0) - 97;
        int currRow = 8 - (pos.charAt(1)- '0');
        int[][] L = knight.getlMoves();
        int move =  2;

        System.out.println(currRow +" "+currFile);
        board1[currRow][currFile] = 1;
        //System.out.println(board[currRow][currFile]);
        knightTour(currRow, currFile, L, move);
        System.out.println(Arrays.deepToString(board1));
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                System.out.print(board[i][j]+"("+board1[i][j]+")"+" ");


            }
            System.out.println();

        }
    }
}
