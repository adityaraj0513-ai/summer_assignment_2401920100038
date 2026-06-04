class Solution {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int col = mat[0].length;
        int sum = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < col; c++) {
                if ((r == c) || (r + c) == rows-1) {
                    sum += mat[r][c];
                }
            }
        }
        return sum;
    }
}