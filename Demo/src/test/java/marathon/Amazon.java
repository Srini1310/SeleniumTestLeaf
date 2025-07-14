package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("a-button-text")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys"+Keys.ENTER);
		WebElement NoofBags = driver.findElement(By.xpath("//div[contains(@class, 's-breadcrumb-header-text')]"));
		System.out.println("Total number of results: " + NoofBags.getText());
//		WebElement firstBrand = driver.findElement(By.xpath("//span[text()='Gear']"));
//		firstBrand.click();
//		Thread.sleep(3000);		
		WebElement secondBrand = driver.findElement(By.xpath("(//div[@id='brandsRefinements']//input[@type='checkbox'])[2]"));
		secondBrand.click();
		Thread.sleep(3000);
		driver.findElement(By.className("a-dropdown-prompt")).click();
		driver.findElement(By.xpath("(//li[@class='a-dropdown-item'])[5]")).click();
		//WebElement BugDetails = driver.findElement(By.partialLinkText("Altus"));
		//System.out.println("Bag Details: "+BugDetails.getText());
		WebElement Price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		System.out.println("Price Details: "+Price.getText());
		WebElement ActPrice = driver.findElement(By.xpath("(//span[@class='a-offscreen'])[3]"));
		System.out.println("Actual Price Details: "+ActPrice.getText());
		System.out.println("Current page tittle "+ driver.getTitle());
		driver.close();
				
		

	}

}
