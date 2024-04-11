package lab_assignment3;

public class MatrixTest {

	public static void main(String[] args) {
		Matrix matrix1 = new Matrix(2, 2);
		Matrix matrix2 = new Matrix(2, 3);

		System.out.println("Enter elements for first matrix:");
		matrix1.getInfo();
		System.out.println("First Matrix is:");
		matrix1.getDisplay();

		System.out.println("\nEnter elements for second matrix:");
		matrix2.getInfo();
		System.out.println("Second Matrix is:");
		matrix2.getDisplay();

		System.out.println("\nAdding matrices:");
		Matrix result = matrix1.add(matrix2);
		if (result != null) {
			System.out.println("Result Matrix is:");
			result.getDisplay();
		}
	}

}
