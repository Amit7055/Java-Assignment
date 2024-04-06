package lab_assignments2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int third;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number Fibonacci Series you want....");
		n = sc.nextInt();
		System.out.println("Fibonacci Series using Method 1: Using Iteration (Using Three variables)");
		for (int i = 0; i < n; i++) {
			System.out.print(first + " ");
			third = first + second;
			first = second;
			second = third;
		}
		sc.close();
	}

}
