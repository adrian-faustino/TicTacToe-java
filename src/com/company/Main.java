package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] gameBoard = initGameBoard();

        printGameBoard(gameBoard);
        // player user input
        playUserInput(gameBoard, "player");
        printGameBoard(gameBoard);
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

    // player user input
    public static void playUserInput(char[][] gameBoard, String user) {
        char turnPiece = 'X';
        if(user.equals("player")) {
            turnPiece = 'X';
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your move (1-9):");
        int pos = scan.nextInt();

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
        }
    }


}
