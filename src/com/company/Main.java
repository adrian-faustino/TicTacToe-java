package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] gameBoard = initGameBoard();
        String turn = "player";
        boolean winner = false;

        while (!winner) {
            System.out.println();
            printGameBoard(gameBoard);
            // get user move
            int pos = getPlayerMove(turn);
            // play user move
            playUserInput(gameBoard, turn, pos);
            // get CPU move
            playUserInput(gameBoard, "CPU", generateCPUMove(1, 9));
            printGameBoard(gameBoard);
        }
    }

    // initialize game board
    public static char[][] initGameBoard() {
        char[][] gameBoard = { {'1', '|', '2', '|', '3'},
                                {'-', '+', '-', '+', '-'},
                                {'4', '|', '5', '|', '6'},
                                {'-', '+', '-', '+', '-'},
                                {'7', '|', '8', '|', '9'}};
        return gameBoard;
    }

    // print game board
    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    // return int from player or a random num for CPU
    public static int getPlayerMove (String user) {
        int move;
        if(user.equals("player")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your move (1-9):");
            move = scan.nextInt();
        } else {
            // todo: generate random num
            move = 9;
        }
        return move;
    }

    // player user input
    public static void playUserInput(char[][] gameBoard, String user, int pos) {
        char turnPiece;
        if(user.equals("player")) {
            turnPiece = 'X';
        } else {
            turnPiece = 'O';
        };

        switch (pos) {
            case 1:
                gameBoard[0][0] = turnPiece;
                break;
            case 2:
                gameBoard[0][2] = turnPiece;
                break;
            case 3:
                gameBoard[0][4] = turnPiece;
                break;
            case 4:
                gameBoard[2][0] = turnPiece;
                break;
            case 5:
                gameBoard[2][2] = turnPiece;
                break;
            case 6:
                gameBoard[2][4] = turnPiece;
                break;
            case 7:
                gameBoard[4][0] = turnPiece;
                break;
            case 8:
                gameBoard[4][2] = turnPiece;
                break;
            case 9:
                gameBoard[4][4] = turnPiece;
                break;
            default:
                break;
        }
    }

    // return a random number within a range (for CPU move) All inclusive
    public static int  generateCPUMove(int min, int max) {
        int random_int = (int)(Math.random() * ((max - min) + 1)) + min;
        return random_int;
    }


}
