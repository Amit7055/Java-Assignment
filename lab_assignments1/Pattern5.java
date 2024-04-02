package lab_assignments1;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 7; i > 0; i--) {
			for (int n = 1; n <= 7 - i; n++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
