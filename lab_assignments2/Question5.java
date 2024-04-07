package lab_assignment2;
import java.util.*;

public class Question5 {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int evenCount = 0;
	        int oddCount = 0;
	        for (int i = 0; i < size; i++) {
	            if (arr[i] % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        // Print the results
	        System.out.println("Number of even elements: " + evenCount);
	        System.out.println("Number of odd elements: " + oddCount);

	        scanner.close();
	    

	}

}
