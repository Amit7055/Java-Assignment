package lab_assignments1;

public class Patterns2 {
	public static void main(String[] args) {
		int px = 0;
		int py = 4;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 2 || px == j || py == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
