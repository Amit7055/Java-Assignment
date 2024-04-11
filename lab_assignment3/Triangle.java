package lab_assignment3;

public class Triangle {

	private int side1, side2, side3;

	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public void areaTriangle() {
		System.out.println("Area of Triangle :  " + (side1 + side2) / 2);
	}

	public void perimeterTriangle() {
		System.out.println("Perimeter of Triangle : " + (side1 + side2 + side3));
	}

	public static void main(String[] args) {
		System.out.println("1. Write a program to print the area and perimeter of a triangle having sides of\r\n"
				+ "   3, 4 and 5 units by creating a class named &#39;Triangle&#39; with parameter in its\r\n"
				+ "constructor.");

		Triangle triangle = new Triangle(3, 4, 5);
		triangle.areaTriangle();
		triangle.perimeterTriangle();

	}

}
