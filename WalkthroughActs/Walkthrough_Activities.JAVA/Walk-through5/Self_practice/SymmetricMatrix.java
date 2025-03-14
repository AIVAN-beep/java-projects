public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        boolean isSymmetric = checkSymmetry(matrix);

        System.out.println("Matrix:");
        printMatrix(matrix);

        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is NOT symmetric.");
        }
    }

    public static boolean checkSymmetry(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false; 
                }
            }
        }
        return true; 
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
