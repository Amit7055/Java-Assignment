package lab_assignments2;

import java.util.Scanner;

public class Question3 {

	public int Factorial(int n) {
		if (n == 1)
			return n;
		return n * Factorial(n - 1);
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how number of which you want Factorial....");
		n = sc.nextInt();
		Question3 factorial = new Question3();
		System.out.println("Factorial of a Number using Recursion in Java");
		System.out.println("Factorial of number " + n + " is " + factorial.Factorial(n));

		sc.close();

	}

}
