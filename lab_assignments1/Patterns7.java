package lab_assignments1;

public class Patterns7 {

	public static void main(String[] args) {
		int i, j,k=1;
		int n = 6;
		for (i = 1; i <= n; i++) 
		{
			for (j = 1; j <= 2 * (n - i); j++) 
			{
				System.out.print(" ");
			}

			for (j = i; j >= 1; j--) 
			{
				System.out.print(i + " ");
			}

			for (j = 2; j <= i; j++) 
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
