package week4.day2.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AcmeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		
		//Load URL
		driver.get("https://acme-test.uipath.com/account/login");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Enter UserName
		 driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com", Keys.TAB);
		 
		 //Enter Password
		 driver.findElementById("password").sendKeys("leaf@12");
		 
		//Clickon Login Button
		 driver.findElementById("buttonLogin").click();
		 
		 WebElement vendor = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");

		 Actions builder= new Actions(driver);
		 builder.moveToElement(vendor).perform();
		 
		 driver.findElementByXPath("//a[text()='Search for Vendor']").click();
		 
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		
		driver.findElementById("buttonSearch").click();
		
		String countryName = driver.findElementByXPath("//table[@class='table']//td[.='Blue Lagoon']/following-sibling::td[4]").getText();
		
		System.out.println(countryName);
		
		driver.findElementByXPath("//a[text()='Log Out']").click();
		
		driver.close();
		
		
		
		
			
			
	}

}
