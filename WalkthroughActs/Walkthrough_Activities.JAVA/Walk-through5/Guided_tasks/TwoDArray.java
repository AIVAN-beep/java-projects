public class TwoDArray {
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int sum = 0;
		// Printing 2D Array
		System.out.println("Matrix:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
				sum += matrix[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum of all the Elements: " + sum);
	}
}