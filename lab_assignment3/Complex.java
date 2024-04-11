package lab_assignment3;

public class Complex {

	private double real, imag;

	public Complex(double real, double imag) {
		super();
		this.real = real;
		this.imag = imag;
	}

	public void addComple(Complex complex2) {

		System.out.println("2.Print the sum, difference and product of two complex numbers by creating a\r\n"
				+ "class, named &#39;Complex&#39; with separate methods for each operation whose real and\r\n"
				+ "imaginary parts are entered by user. Use Constructors to initialize the data\r\n" + "members");

		Complex complex3 = new Complex(0, 0);
		complex3.real = real + complex2.real;
		complex3.imag = imag + complex2.imag;

		System.out.println(" " + real + " +  " + imag + "i ");
		System.out.println("+" + complex2.real + " +  " + complex2.imag + "i ");
		System.out.println("---------------");
		System.out.println(" " + complex3.real + " + " + complex3.imag + "i ");
	}

	public static void main(String[] args) {

		Complex complex = new Complex(5, 6);
		Complex complex2 = new Complex(5, 6);
		complex.addComple(complex2);
	}

}
