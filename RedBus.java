package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chromedriver", "./chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElementById("src").sendKeys("Chennai");
		
		driver.findElementById("src").sendKeys(Keys.TAB);
		
		driver.findElementById("dest").sendKeys("Banglore");
		
		driver.findElementById("dest").sendKeys(Keys.TAB);
		
		
		driver.findElementById("onward_cal").click();
		
		driver.findElementByXPath("(//td[text()='30'])[2]").click();
		
		driver.findElementByXPath("(//label[@for='dtAfter 6 pm'])[2]").click();
		
		driver.findElementById("bt_SLEEPER").click();
		
		driver.findElementByXPath("//div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[7]/a[1]").click();
		
		
		
		
		

	}

}
