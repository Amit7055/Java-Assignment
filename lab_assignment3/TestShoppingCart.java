package lab_assignment3;

public class TestShoppingCart {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart(3);

		cart.addProduct("Bus", 50);
		cart.addProduct("Car", 150);
		cart.addProduct("Airoplane ", 50);
		cart.addProduct("Bus", 50);

		cart.display();
		cart.calTotal();

	}

}
