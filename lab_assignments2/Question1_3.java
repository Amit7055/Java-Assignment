package lab_assignments2;

import java.util.Scanner;

public class Question1_3 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number Fibonacci Series you want....");
		n = sc.nextInt();
		int[] arr=new int[n];
		arr[0]=0;
		arr[1]=1;
		for (int i = 2; i < n; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println("Fibonacci Series using Method 3: Using Formula a[i]=a[i-1]+a[i-2] (Using Array)");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");;
		}
		
		sc.close();

	}

}
