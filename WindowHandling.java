package week3.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("home").click();
		/*String fwindow = driver.getWindowHandle();
		System.out.println(fwindow);
		System.out.println(driver.getTitle());*/
		
		Set<String> allwindow = driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(allwindow);
		driver.switchTo().window(lst.get(1));
		System.out.println(driver.getTitle());
		
		driver.close();
		
		

	}

}
