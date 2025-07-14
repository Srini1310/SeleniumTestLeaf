package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return (browserName);
	}
	
	void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser obj = new Browser();
		obj.loadUrl();
		String BrName = obj.launchBrowser("Chrome");
		System.out.println(BrName);
	}

}
