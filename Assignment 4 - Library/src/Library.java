import java.util.ArrayList;
import java.util.List;

public class Library {
	// Add the missing implementation to this class
	ArrayList<Book> libraryBooks = new ArrayList<Book>();
	String address;
	static String hours = "Libraries are open daily from 9am to 5pm.";

	public Library(String address) {
		this.setAddress(address);
	}

	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();

		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");

		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();

	}

	private void returnBook(String string) {
		for (int i = 0; i < libraryBooks.size(); i++) {
			if (libraryBooks.get(i).getTitle().equals(string)) {
				libraryBooks.get(i).returned();
				System.out.println("You successfully returned " + libraryBooks.get(i).getTitle());
			}
		}
	}

	private void printAvailableBooks() {
		if (libraryBooks.size() > 0) {
			for (int i = 0; i < libraryBooks.size(); i++) {
				if (!this.libraryBooks.get(i).isBorrowed())
					System.out.println(libraryBooks.get(i).getTitle());
			}
		} else {
			System.out.println("No book in catalog.");
		}
	}

	private void borrowBook(String bookTitle) {
		int bookIndex = findBook(bookTitle);

		if (bookIndex == -1) {
			System.out.println("Sorry, this book is not in our catalog.");
			System.out.println();
		} else {
			if (libraryBooks.get(bookIndex).isBorrowed()) {
				System.out.println("Sorry this book is already borrowed.");
			} else {
				libraryBooks.get(bookIndex).rented();
				System.out.println("You successfully rented " + libraryBooks.get(bookIndex).getTitle());
			}

		}
	}

	private void printAddress() {
		System.out.println(this.getAddress());
	}

	private static void printOpeningHours() {
		System.out.println(hours);
	}

	private void addBook(Book book) {
		libraryBooks.add(book);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int findBook(String bookTitle) {
		int i = 0;
		boolean found = false;
		if (libraryBooks.size() > 0) {
			do {
				if (libraryBooks.get(i).getTitle().equals(bookTitle)) {
					found = true;
					return i;
				}
				i++;
			} while (!found);
			if (i != -1 || i > libraryBooks.size()) {
				return i;
			} else {
				return -1;
			}
		} else {
			return -1;
		}

	}
}