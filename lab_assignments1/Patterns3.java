package lab_assignments1;

public class Patterns3 {

	public static void main(String[] args) {
		for(int  i = 1 ; i < 7 ; i++)
		{
			for(int j = 1 ; j <= i ;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 7 ; i > 0 ; i--)
		{
			for(int j = 1 ; j < i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
