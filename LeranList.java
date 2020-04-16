package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranList {

	public static void main(String[] args) {
		
		/*1) https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC
		2) Click on Sort on Date
	3) Get all the Train Names
	   Xpath: //div[@id='divTrainsList']//td[@class=''][2] 
	   findElements -> List<WebElement>
	4) Create another List using ArrayList (trainNames)
	5) for each loop : List<WebElement>
	6) You will get each WebElement : get its text 
	7) Add the text to your created list (trainNames.add())
	8) After the loop ends, sort it
	9) Print it with the loop!!*/
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementById("chkSelectDateOnly").click();
		List<WebElement> TrainNames = driver.findElementsByXPath("//div[@id='divTrainsList']//td[@class=''][2]");
		ArrayList<String> alltrainnames=new ArrayList<String>();
		for (WebElement trainname : TrainNames) {
			System.out.println("Trainnames : "+trainname.getText());
			alltrainnames.add(trainname.getText());
			}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Collections.sort(alltrainnames);
		for (String train : alltrainnames) {
		
			System.out.println("after sorting : "+train);
			
		}
		
		
		
		
	}

}
