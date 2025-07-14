package week1.day2;

public class Library {

	String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}

	void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book = new Library();
		String BName = book.addBook("psychology of money");
		System.out.println("Book Name is "+ BName);
		book.issueBook();

	}

}
