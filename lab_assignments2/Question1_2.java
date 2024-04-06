package lab_assignments2;

import java.util.Scanner;

public class Question1_2 {

	public int Fibonacci(int n) {
		if (n <= 1)
			return n;
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number Fibonacci Series you want....");
		n = sc.nextInt();
		System.out.println("Fibonacci Series using Method 2: Using Recursion");
		Question1_2 obj = new Question1_2();
        for (int i = 0; i < n; i++) {
            System.out.print(obj.Fibonacci(i) + " ");
        }
			

		sc.close();
	}
}
