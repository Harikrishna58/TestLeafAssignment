package week4.day4;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LearnAlertExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "./chromedriver.exe");
		
		System.setProperty("webdriver.chrome.silentOutput", "true");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("unhandledPromptBehavior", UnexpectedAlertBehaviour.DISMISS);
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		Capabilities capabilities = driver.getCapabilities();
		
		for(String eachcap:capabilities.getCapabilityNames()) {
			System.out.println(eachcap);
		}
		
		String browserName = driver.getCapabilities().getBrowserName();
		System.out.println(browserName);
		
		String version = driver.getCapabilities().getVersion();
		System.out.println(version);
	}

}
