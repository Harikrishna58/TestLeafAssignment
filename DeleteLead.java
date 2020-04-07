package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//implicitly wait and maximize browser window
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// find username
		
		WebElement eleUserName = driver.findElementById("username");
		eleUserName.clear();//clear
		eleUserName.sendKeys("DemoSalesManager");//type
		
		// find the password and interact
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		// click on the login
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		// click on CRM SFA
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByPartialLinkText("Leads").click();
		Thread.sleep(3000);
		driver.findElementByPartialLinkText("Find Leads").click();
		Thread.sleep(3000);
        driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
        Thread.sleep(3000);
      driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9865987452");
      
      driver.findElementByXPath("//button[text()='Find Leads']").click();
      
      Thread.sleep(3000);
      
      WebElement id = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
      String myId = id.getText();
      System.out.println(myId);
      
      Thread.sleep(3000);
                     
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
        Thread.sleep(3000);
        
        driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
        Thread.sleep(3000);
        
        driver.findElementByXPath("//a[text()='Find Leads']").click();
        Thread.sleep(3000);
        
        driver.findElementByXPath("//input[@name='id']").sendKeys(myId);
        Thread.sleep(3000);
        
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(3000);
        
       WebElement message = driver.findElementByXPath("//div[text()='No records to display']");
       String correctMessage = message.getText();
       Thread.sleep(3000);
        
        
		
		String ExpectedMessage = "No records to display";

		if(correctMessage.equalsIgnoreCase(ExpectedMessage))
		{
			System.out.println("Record Not Found");
		}
		else
		{
			System.out.println("Record Found");
			
		}
		 Thread.sleep(3000);
     driver.close();   

}



	}


