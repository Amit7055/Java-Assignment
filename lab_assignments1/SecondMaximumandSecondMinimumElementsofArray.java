package lab_assignments1;

import java.util.Arrays;

public class SecondMaximumandSecondMinimumElementsofArray {

	public static void main(String[] args) {
		int arr[] = { 7, 99, 55, 11, 44, 66 };
		Arrays.sort(arr);
		for (int i = 0; i < 6; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Second Maximum is "+arr[arr.length-2]+" at "+(arr.length-2)+" position");
		System.out.println("Second Minimum is "+arr[1]+" at 1 position");
	}

}
