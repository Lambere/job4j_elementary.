package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = false;
        for (int i = 0; i <= column; i++) {
            for (int r = 0; r <= column; r++) {
                if (board[i][r] == 'X' && board[1][r] == 'X' && board[2][r] == 'X') {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}