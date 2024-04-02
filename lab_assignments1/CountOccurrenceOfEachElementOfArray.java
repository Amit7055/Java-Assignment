package lab_assignments1;

public class CountOccurrenceOfEachElementOfArray {

	public static void main(String[] args) {
		int arr[] = { 7, 99, 55, 55, 44, 66 };
		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					count++;
				}
			}
			System.out.println("total occurance of " + arr[i] + " is " + count);
		}

	}

}
