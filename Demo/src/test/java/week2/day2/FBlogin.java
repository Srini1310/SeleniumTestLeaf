package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class FBlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		// Create Faker instance for generating fake data
        Faker faker = new Faker();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElements(By.xpath("//a[text()=\"Create new account\"]")).click();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(faker.name().firstName());  
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(faker.name().lastName());
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys(faker.internet().emailAddress());
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys(faker.internet().password()); 
		driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
		WebElement dayDD =driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select daySelect   = new Select(dayDD);
		daySelect.selectByIndex(3);
		WebElement monthDD = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select monthSelect = new Select(monthDD);
        monthSelect.selectByValue("10");                // Selects October
		WebElement Dropdown3 =driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select2 = new Select(Dropdown3);
		select2.selectByVisibleText("1999");
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
