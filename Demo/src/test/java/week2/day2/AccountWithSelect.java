package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class AccountWithSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		Faker faker = new Faker();
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
		// Generate a random account name using Faker
		String accountName = faker.company().name();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(accountName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		Thread.sleep(3000);
		//Select "ComputerSoftware" as industry (Index 2 in this case)
        WebElement industryDD = driver.findElement(By.name("industryEnumId"));
        Select industry = new Select(industryDD);
        industry.selectByIndex(2); // Adjust if needed
        // Select "S-Corporation" as ownership using value
        WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
        Select ownership = new Select(ownershipDD);
        ownership.selectByValue("OWN_SCORP");
		WebElement SRCDD = driver.findElement(By.name("dataSourceId"));
		Select Source   = new Select(SRCDD);
		Source.selectByVisibleText("Employee");
		WebElement MarketingDD = driver.findElement(By.name("marketingCampaignId"));
		Select Marketing   = new Select(MarketingDD);
		Marketing.selectByIndex(5);
		WebElement StateDD = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select State = new Select(StateDD);
		State.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		//Verify that the account name is displayed
        WebElement createdAccount = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
        String createdName = createdAccount.getText();
        if (createdName.contains(accountName)) {
            System.out.println("Account created successfully: " + createdName);
        } else {
            System.out.println("Account name does not match!");
        }
		System.out.println(driver.getTitle());
		driver.close();
		

	}
	}



