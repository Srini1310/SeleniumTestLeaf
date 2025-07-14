package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.facebook.com/");
		//Maximize the browser window
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("identify")).click();
		//get the title of the page
				String title = driver.getTitle();
				System.out.println(title);
		driver.close(); //Close the current browser window
		
	
	}

}
