package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chromedriver", "./chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElementById("email").sendKeys("xxx@gmail.com");
		
		driver.findElementById("pass").sendKeys("xxxx");
		
		driver.findElementById("u_0_b").click();
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(4000);
		
		driver.findElementById("userNavigationLabel").click();
		
		Thread.sleep(2000);
		
		driver.findElementByPartialLinkText("Log Out").click();
		
		driver.close();

	}

}
