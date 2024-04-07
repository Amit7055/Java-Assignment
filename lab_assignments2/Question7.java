package lab_assignment2;

public class Question7 {

	public static void rotateMatrixClockwise(int[][] matrix) {
		// Transpose the matrix
		transpose(matrix);

		// Reverse each row
		reverseRows(matrix);
	}

	// Method to transpose the matrix
	private static void transpose(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				// Swap matrix[i][j] and matrix[j][i]
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	// Method to reverse each row of the matrix
	private static void reverseRows(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			int left = 0;
			int right = n - 1;
			while (left < right) {
				// Swap matrix[i][left] and matrix[i][right]
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;
				left++;
				right--;
			}
		}
	}

	// Method to print the matrix
	private static void printMatrix(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, 
						   { 4, 5, 6 }, 
						   { 7, 8, 9 } };

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		rotateMatrixClockwise(matrix);

		System.out.println("Matrix after rotating 90 degrees clockwise:");
		printMatrix(matrix);
	}

}
