package lab_assignment3;

public class LibraryTest {

	public static void main(String[] args) {
		Library library = new Library(5);

		library.addBook(new Book("MATH", "AMIT", 2001));
		library.addBook(new Book("C++", "MANISH", 2001));
		library.addBook(new Book("JAVA", "SHIVAM", 1925));

		library.displayBooks();

		library.removeBook("MATH");

		library.displayBooks();
	}

}
