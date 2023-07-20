

public class Questao2 {

    public static int contarOcorrenciasSubmatriz(int[][] A, int[][] B) {
        int occurrences = 0;

        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        for (int i = 0; i <= rowsA - rowsB; i++) {
            for (int j = 0; j <= colsA - colsB; j++) {
                if (isSubmatrixAtPosition(A, B, i, j)) {
                    occurrences++;
                }
            }
        }

        return occurrences;
    }

 
    private static boolean isSubmatrixAtPosition(int[][] A, int[][] B, int row, int col) {
        int rowsB = B.length;
        int colsB = B[0].length;

        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                if (A[row + i][col + j] != B[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
