package week1.day3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.findElementById("email").sendKeys("Welcome@123");
		
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("welcome@123",Keys.TAB);
		
		String attribute = driver.findElementByName("username").getAttribute("value");
		System.out.println(attribute);
		
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		
		boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(enabled);
	}

}
