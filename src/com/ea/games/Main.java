package com.ea.games;

import java.util.Scanner;


/*  Sheela Chennamaneni  05/13/2018 */

public class Main {


    static char[] ch = new char[9];
    static char currentPlayer = 'X';

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count =0;
        //Initialize the Board with place '-''s
        for (int i = 0; i < 9; i++) {
            {
                ch[i] = '-';
            }
        }
        System.out.println("Player X will start first");

        do{
            printBoard();
            if (count == 9){
                System.out.println("Game's a draw. GoodBye !!!");
                System.exit(0);
            }
            System.out.println("Player " + currentPlayer + " a number between 0 and 8 to select a spot");
            int slot = in.nextInt();
            if (slot > 8 || slot < 0){
                System.out.println("Wrong input number. Try Again! ");
                continue;
            }
            if (ch[slot] == '-') {
                ch[slot] = currentPlayer;
                System.out.println("In slot name "+ch[slot]);
            }  else {
                continue;
            }
            winner();
            switchPlayer();
            count++;
        }while (count <10);
    }

    //Tic tac toe basic board
    public static void printBoard() {
        System.out.println(" ----- ");
        System.out.println("|" + ch[0] + "|" + ch[1] + "|" + ch[2] + "|");
        System.out.println(" ----- ");
        System.out.println("|" + ch[3] + "|" + ch[4] + "|" + ch[5] + "|");
        System.out.println(" ----- ");
        System.out.println("|" + ch[6] + "|" + ch[7] + "|" + ch[8] + "|");
        System.out.println(" ----- ");
    }

    //To switch players when playing
    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    //To find winner check columns,rows and diaganols
    public static void winner() {
        //check for column's
        if ((ch[0] == 'X') && (ch[1] == 'X') && (ch[2] == 'X') || (ch[0] == 'O') && (ch[1] == 'O') && (ch[2] == 'O')) {
            System.out.println("Player " + currentPlayer + "  won the match");
            printBoard();
            System.exit(0);
        } else if ((ch[3] == 'X') && (ch[4] == 'X') && (ch[5] == 'X') || (ch[4] == 'O') && (ch[5] == 'O') && (ch[3] == 'O')) {
            System.out.println("Player " + currentPlayer + "  won the match");
            printBoard();
            System.exit(0);
        } else if ((ch[7] == 'X') && (ch[8] == 'X') && (ch[6] == 'X') || (ch[7] == 'O') && (ch[8] == 'O') && (ch[6] == 'O')) {
            System.out.println("Player " + currentPlayer + "  won the match");
            printBoard();
            System.exit(0);

        }
        //check for diagnols
        if ((ch[0] == 'X') && (ch[4] == 'X') && (ch[8] == 'X') || (ch[0] == 'O') && (ch[4] == 'O') && (ch[8] == 'O')) {
            System.out.println("Player " + currentPlayer + "  won the match");
            printBoard();
            System.exit(0);
        } else if ((ch[2] == 'X') && (ch[4] == 'X') && (ch[6] == 'X') || (ch[4] == 'O') && (ch[2] == 'O') && (ch[6] == 'O')) {
            System.out.println("Player " + currentPlayer + "  won the match");
            printBoard();
            System.exit(0);
        } else if ((ch[7] == 'X') && (ch[8] == 'X') && (ch[6] == 'X') || (ch[7] == 'O') && (ch[8] == 'O') && (ch[6] == 'O')) {
            System.out.println("Player " + currentPlayer + "  won the match");
            printBoard();
            System.exit(0);
        }

        //check for 0,3,6
        if ((ch[0] == 'X') && (ch[3] == 'X') && (ch[6] == 'X') || (ch[0] == 'O') && (ch[3] == 'O') && (ch[6] == 'O')) {
            System.out.println("Player " + currentPlayer + "  won the match");
            printBoard();
            System.exit(0);
        } else if ((ch[1] == 'X') && (ch[4] == 'X') && (ch[7] == 'X') || (ch[1] == 'O') && (ch[4] == 'O') && (ch[7] == 'O')) {
            System.out.println("Player " + currentPlayer + "  won the match");
            printBoard();
            System.exit(0);
        } else if ((ch[2] == 'X') && (ch[8] == 'X') && (ch[5] == 'X') || (ch[2] == 'O') && (ch[8] == 'O') && (ch[5] == 'O')) {
            System.out.println("Player " + currentPlayer + "  won the match");
            printBoard();
            System.exit(0);
        }
    }
}











