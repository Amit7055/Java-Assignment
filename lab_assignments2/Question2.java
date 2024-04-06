package lab_assignments2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, temp;
		int sum = 0;
		System.out.println(
				"Enter number to check wheather number is Harshad number(Harshad number is a number or an integer in base 10 which is acompletely divisible by sum of its digits). ");
		num = sc.nextInt();
		temp = num;

		while (temp > 0) {
			sum = sum + temp % 10;
			temp = temp / 10;
		}
		if (num % sum == 0)
			System.out.println(num + " : Number is an Harshad number ");
		else
			System.out.println(num + " : Number is not an Harshad number ");
		sc.close();

	}

}
