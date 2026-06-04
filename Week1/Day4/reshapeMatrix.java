class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newMatrix = new int[r][c];
        int row = mat.length;
        int col = mat[0].length;
        if ((r * c) != (row * col))
            return mat;
        int p = 0;
        int q = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newMatrix[p][q] = mat[i][j];
                if (q == c - 1) {
                    p = p + 1;
                    q = 0;
                } else {
                    q++;
                }
            }
        }
        return newMatrix;
    }
}