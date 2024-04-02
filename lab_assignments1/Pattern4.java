package lab_assignments1;

public class Pattern4 {

	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {
			for (int n = 1; n < 7 - i; n++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
