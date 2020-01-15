package ru.job4j.array;

public class MatrixCheck {

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index=0; index<board.length; index++) {
            if (board[index][index]=='X' && (monoHorizontal(board, index) || monoVertical(board, index))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean monoHorizontal(char[][] data, int i) {
        boolean result = true;
        for (int index=0; index<data.length; index++) {
            if (data[i][i]!=data[i][index]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] data, int i) {
        boolean result = true;
        for (int index=0; index<data.length; index++) {
            if (data[i][i]!=data[index][i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
