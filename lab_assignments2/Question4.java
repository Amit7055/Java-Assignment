package lab_assignments2;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, mid, end;
		System.out.println("Enter the size of the array");
		n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " interger numbers");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Array after sorting....");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		mid = (arr.length / 2);
		end = arr.length - 1;
		while (mid < end) {
			arr[mid] = arr[mid] + arr[end];
			arr[end] = arr[mid] - arr[end];
			arr[mid] = arr[mid] - arr[end];
			mid++;
			end--;
		}
		System.out.println("Sorting first half in Ascending order and second half in Descending order....");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		scanner.close();
	}

}
