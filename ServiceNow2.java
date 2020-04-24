package week4.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ServiceNow2 {

	public static void main(String[] args) throws InterruptedException {
		
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
				String verify = driver.findElementById("change_request.number").getAttribute("value");
				
				if(changenumber.equals(verify)) {
					System.out.println("same number");
				}
				
				//Update state as assess
				WebElement state = driver.findElementById("change_request.state");
				Select sl=new Select(state);
				System.out.println(sl);
				
				//click search
				driver.findElementById("lookup.change_request.assigned_to").click();
				
				//Navigate to window
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> ls=new ArrayList<String>(windowHandles);
				String sWindow = ls.get(1);
				
				driver.switchTo().window(sWindow);
				
				driver.findElementByXPath("//span[text()='Press Enter from within the input to submit the search.']/following::input)[1]").sendKeys("ITIL",Keys.ENTER);
				
				//click first value
				driver.findElementByClassName("glide_ref_item_link").click();
				
				//Navigate back to main window
				String fWindow = ls.get(0);
				driver.switchTo().window(fWindow);
				
				//click search icon on assignment group
				driver.findElementById("lookup.change_request.assignment_group").click();
				
				//Navigate to window
				Set<String> windowHandles2 = driver.getWindowHandles();
				List<String> ls1=new ArrayList<String>(windowHandles2);
				String swindow1 = ls1.get(1);
				
				driver.switchTo().window(swindow1);
				
				//click the first value
				driver.findElementById("//a[text()='Application Development']").click();
				
				//Navigate back to main window
				String fwindow1 = ls.get(0);
				driver.switchTo().window(fwindow1);
				
				//click on update
				driver.findElementById("sysverb_update").click();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
}
