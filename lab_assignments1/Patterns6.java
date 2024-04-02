package lab_assignments1;

public class Patterns6 {

	public static void main(String[] args) {
		int px = 5, py = 5;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 5 || px == j || py == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			px--;
			py++;
		}

	}

}
