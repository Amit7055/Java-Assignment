package lab_assignment3;

import java.util.Scanner;

public class Matrix {

	private int rows;
	private int cols;
	private int[][] matrix;

	Scanner sc = new Scanner(System.in);

	public Matrix() {
		// TODO Auto-generated constructor stub
	}

	public Matrix(int rows, int cols) {
		super();
		this.rows = rows;
		this.cols = cols;
		this.matrix = new int[rows][cols];
	}

	public void getInfo() {
		System.out.println("ENter matrix element");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}

	public void getDisplay() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public Matrix add(Matrix matrix2) {
		Matrix result = new Matrix(this.rows, this.cols);
		if (this.rows == matrix2.rows && this.cols == matrix2.cols) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					result.matrix[i][j] = matrix2.matrix[i][j] + this.matrix[i][j];
				}
			}
			return result;
		} else {
			System.out.println("Matrices cannot be added.");
			return null;
		}

	}

}
