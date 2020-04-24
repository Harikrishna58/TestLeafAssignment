package week4.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev87750.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				//login to the application
				driver.switchTo().frame(driver.findElementById("gsft_main"));
				driver.findElementById("user_name").sendKeys("admin");
				driver.findElementById("user_password").sendKeys("ZrfyCa3ByI9G");
				driver.findElementById("sysverb_login").click();
				
				//Enter Incident in filter navigator
				driver.findElementById("filter").sendKeys("Change");
				Thread.sleep(3000);
				
				// Click create new
				driver.findElementByXPath("//div[text()='Create New']").click();
			

				// Navigate to frame
				driver.switchTo().frame("gsft_main");

				// Click the link
				driver.findElementByLinkText("Normal: Changes without predefined plans require approval and/or CAB authorization.").click();;
				
				// GEt the change request number
				WebElement number = driver.findElementById("change_request.number");
				
				// Change number
				String changenumber = number.getAttribute("value");
				
				// Enter short description
				driver.findElementById("change_request.short_description").sendKeys("Creating CR");
				
				// Click submit
				driver.findElementById("sysverb_insert").click();
				
				// Enter the created CR number
				driver.findElementByXPath("//span[text()='Press Enter from within the input to submit the search.']/following::input)[1]").sendKeys(changenumber, Keys.ENTER);
				Thread.sleep(3000);
				
				// Click the link
				driver.findElementByClassName("linked formlink").click();
				Thread.sleep(3000);
				
				// Verify the number
				String verifych = driver.findElementById("change_request.number").getAttribute("value");
				if(changenumber.equals(verifych)) {
					System.out.println("same number");
				}
				
				// Close the browser
				driver.close();
				
				
	}

}
