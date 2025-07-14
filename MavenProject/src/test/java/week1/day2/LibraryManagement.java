package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book1 = new Library();
		String BName = book1.addBook("psychology of money");
		System.out.println("Book Name is "+ BName);
		book1.issueBook();
	}

}
