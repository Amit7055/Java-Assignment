package lab_assignment2;

import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		int temp;
		for (int n = 0; n < 2; n++) {
			temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println("Java program for rotation of elements of array right.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("Java program for rotation of elements of array left.");
		for (int n = 0; n < 2; n++) {
			temp = a[a.length - 1];
			for (int i = a.length - 1; i > 0; i--) {
				a[i] = a[i - 1];
			}
			a[0] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		scanner.close();
	}

}
