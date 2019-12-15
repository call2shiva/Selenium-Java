package week4.day2.project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		
		//Load URL
		driver.get("https://zoomcar.com/chennai");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//a[@class='search']").click();
		
		driver.findElementByXPath("//div[text()='Popular Pick-up points']//following-sibling::div[1]").click();
		
		driver.findElementByClassName("proceed").click();
		
		Date date = new Date(); // Get the current date
		DateFormat sdf = new SimpleDateFormat("dd"); //Get only the date (and not month, year, time etc)
		String today = sdf.format(date); // Get today's date
		int tomorrow = Integer.parseInt(today)+1; // Convert to integer and add 1 to it
		System.out.println(tomorrow); // Print tomorrow's date
		
		String tdate = Integer.toString(tomorrow);
		
		WebElement tomorrowDate = driver.findElementByXPath("//div[@class='days']/div[contains(text(),'"+tomorrow+"')]");
		String tDate=tomorrowDate.getText();
		tomorrowDate.click();
		
		driver.findElementByXPath("//button[@class='proceed']").click();
		
		String pickUp = driver.findElementByXPath("//div[@class='label time-label']").getText();		
		 System.out.println(pickUp);
		 
		 String pickUpDate = pickUp.substring(4, 6);
		 System.out.println(pickUpDate);
		 
		 if(tdate.equals(pickUpDate)) {
			 
			 System.out.println("Start date is confirmed");
		 }else
			 
		 {
			 System.out.println("Start date cannot be confirmed");
			 
		 }
		 
		 driver.findElementByClassName("proceed").click();
		 
		 //String price = driver.findElementByXPath("//div[@class='car-amount']/following::div[@class='price']").getText();
	
		   List<WebElement> price = driver.findElementsByXPath("//div[@class='car-amount']//div[1]");
		   
		 	   
		 
		  
		   
		/*List<WebElement> price = driver.findElementsByXPath("//div[@class='price']//following::sup[@class='rupee']");
		 
		int totalSize = price.size();
		
		System.out.println(totalSize);*/
		
		
		
		
		
		
		

		 
		 
		 driver.quit();
		

	}

}
