package week3.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExp {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//implicitly wait and maximize browser window
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// find username
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		// find the password and interact
		
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		
		// click on the login
		
		driver.findElementByXPath("//input[@value='Login']").click();
		
		// click on CRM SFA
		
		driver.findElementByXPath("//div[@id='label']/a").click();
		

		driver.findElementByXPath("//a[text()='Leads']").click();
		
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
	Set<String> fwindow = driver.getWindowHandles();
	System.out.println(fwindow.size());
	List<String> allwindow=new ArrayList<String>(fwindow);
	System.out.println(allwindow.size());
	
	driver.switchTo().window(allwindow.get(1));
	
	driver.findElementByXPath("//input[@name='firstName']").sendKeys("babu");
	
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	Thread.sleep(3000);
	
	driver.findElementByXPath("//a[@class='linktext']").click();
	
	driver.switchTo().window(allwindow.get(0));
	
	driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
	
	Set<String> windowHandles1 = driver.getWindowHandles();
	System.out.println(windowHandles1.size());
	List <String> lst1 = new ArrayList <String>(windowHandles1);
	System.out.println(lst1.size());
	
	//Switch to Find Lead Window	
	driver.switchTo().window(lst1.get(1));
	
	//find the lead and click on the first result
	driver.findElementByXPath("//input[@name='firstName']").sendKeys("M");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(3000);
	driver.findElementByXPath("//a[@class='linktext']").click();
	
	//Switch back to Merge window
	driver.switchTo().window(lst1.get(0));
	
	driver.findElementByXPath("//a[text()='Merge']").click();
	
	Alert builder = driver.switchTo().alert();
	builder.accept();
		
		
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("//input[@name='id']").sendKeys("10085");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	String text = driver.findElementByXPath("//div[@class='x-paging-info']").getText();	
	System.out.println("From is successfully merged with To Lead so: "+text);


	}

}
