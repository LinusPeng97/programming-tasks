package main.java.pers.linus;

public class Solution {
    private int row;
    private int column;
    private char[][] matrix;
    private String word;
    private boolean[][] flag;  // mark the trace

    public boolean isExist(char[][] matrix, String word) {
        if (word.isEmpty()){
            return false;
        }
        row = matrix.length;
        if (row == 0) {
            return false;
        }
        column = matrix[0].length;
        flag = new boolean[row][column];
        this.matrix = matrix;
        this.word = word;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if (search(i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(int i, int j, int index){
        // compare the last letter
        if (index == word.length() - 1){
            return matrix[i][j] == word.charAt(index);
        }

        if (matrix[i][j] == word.charAt(index)){
            flag[i][j] = true;
            // up
            if (i > 0 && !flag[i - 1][j]){
                if (search(i - 1, j, index + 1)){
                    return true;
                }
            }
            // right
            if (j < column - 1 && !flag[i][j + 1]){
                if (search(i, j + 1, index + 1)){
                    return true;
                }
            }
            // down
            if (i < row - 1 && !flag[i + 1][j]){
                if (search(i + 1, j, index + 1)){
                    return true;
                }
            }
            // left
            if (j > 0 && !flag[i][j - 1]){
                if (search(i, j - 1, index + 1)){
                    return true;
                }
            }
            // all directions are not available, reset the flag
            flag[i][j] = false;
        }
        return false;
    }
}
