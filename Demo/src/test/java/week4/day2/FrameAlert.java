package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Switch in to frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		// Switch to alert and click OK
		Alert popup = driver.switchTo().alert();
		popup.accept();
		String Confirmatiomessage =driver.findElement(By.id("demo")).getText();
		System.out.println("Result after clicking OK:" +Confirmatiomessage);

		// Check if the result is as expected
		if (Confirmatiomessage.contains ("You pressed")) {
			System.out.println("Alert accepted successfully");
		}
		else {
			System.out.println("Alert is not handled");
		}
		driver.close();
		
	}

}
