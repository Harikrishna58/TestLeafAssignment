package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//implicitly wait and maximize the browser window
		
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				//find the username
				 driver.findElementById("username").sendKeys("DemoSalesManager");
				

				//find password and interact
			 
			  driver.findElementByName("PASSWORD").sendKeys("crmsfa");

			  // click on login
			  driver.findElementByClassName("decorativeSubmit").click();

			  // click on crm sfa
			  
			  driver.findElementByLinkText("CRM/SFA").click();
			  
				//Create Lead
				driver.findElementByLinkText("Create Lead").click();
				
				//create company name
				
				driver.findElementById("createLeadForm_companyName").sendKeys("cts");
				
				//create first name
				driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
				
				//Create last name
				
				driver.findElementById("createLeadForm_lastName").sendKeys("y");
				
				//submit
				
				driver.findElementByClassName("smallSubmit").click();
				
				Thread.sleep(4000);
				
				//close the browser
				
				driver.close();
				

	}

}
