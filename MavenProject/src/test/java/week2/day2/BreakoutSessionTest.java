package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BreakoutSessionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CloudIQ");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Srini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kuppu");
		//dropdown selection
		WebElement SourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt1= new Select(SourceDD);
		opt1.selectByIndex(4);	
		
		WebElement MarketDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select opt2= new Select(MarketDD);
		opt2.selectByVisibleText("Automobile");
		
		WebElement OwnerDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select opt3= new Select(OwnerDD);
		opt3.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
