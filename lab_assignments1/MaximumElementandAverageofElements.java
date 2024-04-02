package lab_assignments1;

public class MaximumElementandAverageofElements {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int max = arr[0], j = 0;
		byte total = 0;
		for (byte i = 0; i < 5; i++) {
			if (max < arr[i]) {
				max = arr[i];
				j = i;
			}
			total += arr[i];
		}
		System.out.println("Max Element is " + max + " at " + j + " position");
		System.out.println("Average of all the elements is " + ((float) total / 5));
	}

}
