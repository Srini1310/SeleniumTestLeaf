package week3.day2;

public class Chrome extends InheritanceBrowser {
	public void openIncognito()  {
		
		System.out.println("Browser name is " + browserName + "Browser version is " + browserVersion);
	}

	public void clearCache()  {

		System.out.println("Browser name is " + browserName + "Browser version is " + browserVersion);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome chrome= new Chrome();
		chrome.openURL();
		chrome.navigateBack();
		chrome.closeBrowser();
		chrome.openIncognito();
		chrome.clearCache();
		

	}

}
