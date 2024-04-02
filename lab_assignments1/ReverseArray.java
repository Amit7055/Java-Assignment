package lab_assignments1;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int start = 0;
		int end = 4;

		System.out.println("Before");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		while (start < end) {
			arr[start] = arr[start] + arr[end];
			arr[end] = arr[start] - arr[end];
			arr[start] = arr[start] - arr[end];
			start++;
			end--;
		}
		System.out.println();
		System.out.println("After");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
