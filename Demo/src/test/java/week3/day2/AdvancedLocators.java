package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//p[@class=\"top\"]/input")).sendKeys("demosalesmanager");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("(//input[@class='inputLogin']/parent::p)[2]")).sendKeys("crmsfa");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("(//form[@id='login']/p/label/following-sibling::input)[2]"));
		password.sendKeys("crmsfa");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//p[@class=\"top\"]/input")).click();
		

	}

}
