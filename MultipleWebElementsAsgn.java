package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElementsAsgn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Image.html");
		
		//find how many images are available
		List<WebElement> images = driver.findElementsByXPath("//label[text()='Click on this image to go home page']");
		System.out.println(images.size());
		
		//find last image by using keyboard button
		 driver.findElementByXPath("//label[text()='Click me using Keyboard or Mouse'][last()]//following::img").click();
		 
		 //find how many radio buttons are there
		 driver.findElementByXPath("//img[@alt='Radio Button']").click();
		 List<WebElement> radioabuttons = driver.findElementsByTagName("input");
		 System.out.println(radioabuttons.size());
		 
		 driver.navigate().back();
		 
		 //CkechBoxes Select
		 driver.findElementByXPath("//img[@alt='Checkbox']").click();
		 List<WebElement> checkbox = driver.findElementsByXPath("//input[@type='checkbox']");
		 for(WebElement select : checkbox){
			 if(!select.isSelected()){
				 select.click();
			 }
		 }
		 
		 
		 
		 
		
	}

}
