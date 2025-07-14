package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRTestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 //driver.findElement(By.xpath("(//span[@Class='cities-placed'])[1]")).click() ;
		 //driver.findElement(By.xpath("(//span[text()='Chennai'])[3]")).click();
		 
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//div[@id='cinema']")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'][2])")).click();
		driver.findElement(By.xpath("(//li[@Class='p-dropdown-item'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@Class='p-dropdown-item'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		driver.findElement(By.xpath("//button[text()=\"Accept\"]")).click();		
		driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();
		driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();
		WebElement SeatInfo = driver.findElement(By.className("seat-number"));
		System.out.println("Seat Information "+SeatInfo.getText());
		WebElement Totalamt = driver.findElement(By.xpath("//div[@class='all-grand']//span"));
		System.out.println("Ticket fees Information "+Totalamt.getText());
		driver.findElement(By.className("fb-added-btndesk")).click();
		//driver.findElement(By.xpath("(//i[@class='pi pi-times'])[1]")).click();
		System.out.println("Current page tittle "+ driver.getTitle());
		driver.close();
		
		
		
	}

}
