package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acme {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "./chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://acme-test.uipath.com/account/login");
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		
		driver.findElementById("password").sendKeys("leaf@12");
		
		driver.findElementById("buttonLogin").click();
		
		
		
		driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]").click();
		driver.findElementByXPath("//a[@href='/vendors/search']").click();
		
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		
		 String cname=driver.findElementByXPath("//table[@class='table']").getText();
		 System.out.println(cname);
		
		 driver.findElementByXPath("//a[@href='/account/logout/']").click();
		 driver.close();
		
		
		
		
		

	}

}
