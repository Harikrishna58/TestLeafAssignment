package week2.day2;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElements {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		//implicitly wait and maximize the browser window
		
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				//how many links are available
				/*List<WebElement> allLinks = driver.findElementsByTagName("a");
				System.out.println(allLinks.size());
				
				//click on the first link
				allLinks.get(0).click();
				
				//print title
				System.out.println(driver.getTitle());*/
				
				//click on the last 'go to home page link'
				
				/*List<WebElement> eles = driver.findElementsByLinkText("Go to Home Page");
				System.out.println(eles.size());
				 eles.get(eles.size()-1).click();*/
				
				WebElement GotoHomePg = driver.findElementByXPath("(//a[text()='Go to Home Page'])[last()]/following-sibling::label");
				System.out.println(GotoHomePg.getText());
				
			  
			
			  

	}

}
