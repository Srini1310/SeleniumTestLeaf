package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Manage the unknown popup after login
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		// Apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/");
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
