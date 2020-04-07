package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//implicitly wait and maximize browser window
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// find username
		
		 driver.findElementById("username").sendKeys("DemoSalesManager");
		
		
		// find the password and interact
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		// click on the login
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		// click on CRM SFA
		
		driver.findElementByLinkText("CRM/SFA").click();
		

		driver.findElementByPartialLinkText("Leads").click();
		
		driver.findElementByPartialLinkText("Find Leads").click();

		
		//enter first name
		driver.findElementByXPath("((//label[text()='First name:'])[3]/following::input)[1]").sendKeys("Hari");
		
		//click find leads
		driver.findElementByXPath("//button[@class='x-btn-text']").click();

		//click on the first lead
		driver.findElementByXPath("//table[@id='ext-gen1689']").click();
		
		//verify title
		
				String Title = driver.getTitle();
				
				String ExpectdTitle = "View Lead | opentabs CRM";

				if(Title.equalsIgnoreCase(ExpectdTitle))
				{
					System.out.println("Title Verfied");
				}
				else
				{
					System.out.println("Not Verified");
				}

				
				//click edit
				driver.findElementByXPath("//a[text()='Edit']").click();
				
				//change the company name/update
				
				driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
				driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("Tcs");
				//click submit
				
				driver.findElementByXPath("//input[@class='smallSubmit'][1]").click();
				
				WebElement CompanyName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
				//confirm the changed name
				String CName = CompanyName.getText();
				String Expected = CompanyName.getText();
				if (Expected.equals(CName))
				{
					System.out.println("Company Name Verfied");
				}
				else
				{
					System.out.println("Incorrect Company Name");
				}
				
				

				//close the browser
				
				
				driver.close();

		
		
		
		
	}


	}


