package week2.day2;


import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			  driver.findElementByLinkText("CRM/SFA").click();
			  
			  driver.findElementByPartialLinkText("Leads").click();
			  
			  driver.findElementByPartialLinkText("Find Leads").click();
			  
			  //Find all first names
			  
			  List<WebElement> allFirstNames=driver.findElementsByXPath("//label[text()='First name:']");
			  
			  //print the count of all first names
			  int size = allFirstNames.size();
			  System.out.println(size);
			  
			  //print the first element
			  WebElement firstmatch = allFirstNames.get(0);
			  System.out.println(firstmatch.getAttribute("class"));
			  
			  
			  
	}

}
