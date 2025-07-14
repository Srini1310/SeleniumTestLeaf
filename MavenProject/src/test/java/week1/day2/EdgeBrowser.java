package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser obj1 = new Browser();
		obj1.loadUrl();
		String BrName = obj1.launchBrowser("Chrome");
		System.out.println(BrName);

	}

}
