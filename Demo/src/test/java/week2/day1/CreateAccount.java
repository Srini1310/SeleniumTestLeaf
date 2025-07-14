package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//Account Tab
		//driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.linkText("Accounts")).click();
		//driver.findElement(By.xpath("//a[@class='selected']")).click();
		driver.findElement(By.linkText("Create Account")).click();
		//driver.findElement(By.partialLinkText("createAccountForm")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Test QA Test");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		Thread.sleep(3000);
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		Thread.sleep(3000);
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		Thread.sleep(3000);
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
	

	}
	}


