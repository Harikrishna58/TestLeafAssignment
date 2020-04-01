package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTabsLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "./chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		Thread.sleep(4000);
		
		driver.findElementByLinkText("Logout").click();
		
		driver.close();

	}

}
