package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadsUsingXpath {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//implicitly wait and maximize the browser window
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//find username
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		//find password 
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		//login
		
		driver.findElementByXPath("//input[@value='Login']").click();
		
		//click CRMSFA
		
		driver.findElementByXPath("//div[@id='label']/a").click();
		
		// click Leads
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		//click on find Leads
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		//enter first name
		
		driver.findElementByXPath("//div[@id='x-form-el-ext-gen248']/input").sendKeys("Babu");
		
		//click findLeads
		
		driver.findElementByXPath("//button[@class='x-btn-text']").click();
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
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
