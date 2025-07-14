package LoginPage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.github.javafaker.Faker;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException, IOException {
        // Set path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivasan K\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        
     // Create Faker instance for generating fake data
        Faker faker = new Faker();

        // Load the URL
        driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");

        // Enter user details
        driver.findElement(By.id("firstName")).sendKeys(faker.name().firstName());       // Faker-generated first name
        driver.findElement(By.id("lastName")).sendKeys(faker.name().lastName());         // Faker-generated last name
        driver.findElement(By.id("email")).sendKeys(faker.internet().emailAddress());    // Faker-generated email
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(faker.internet().password()); 	// Faker - generated password

        
        // Click submit button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);
       driver.navigate().to("https://leafground.com/button.xhtml;jsessionid=node01t728k2g1am2b8gsif0gq60ka2217414.node0");
       Thread.sleep(3000);
       driver.navigate().back();     // Goes back to Google
       System.out.println("Went back to login");
       Thread.sleep(3000);
       driver.navigate().forward();  // Goes forward to Bing again
       System.out.println("Went forward to testleaf page");
       Thread.sleep(3000);
       
       //Take screenshot
//       File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);   //Take screenshot
//       File screenshotstore = new File ("./snaps/img.png");			//Store screenshot to desired path
//       FileHandler.copy(screenshot, screenshotstore);			//Copy screenshot from storage
      driver.navigate().refresh();
        driver.quit();

        // You can add waits, assertions, or validations here as needed

        // Optionally close the browser
        // driver.quit();
    }
}

