package week4.day2.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		
		//Load URL
		driver.get("https://amazon.in");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles",Keys.ENTER);
		
		String firstPrice = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		
		System.out.println(firstPrice);
		
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> lstwindowHandles= new ArrayList<String>(windowHandles);
		
		int windowCount = lstwindowHandles.size();
		
		System.out.println(windowCount);
		
		for(int i=0; i<windowCount; i++) {
		
		if(i==1) {
			
		String lastWindow = lstwindowHandles.get(i);
		
		driver.switchTo().window(lastWindow);
		
		String rating = driver.findElementById("acrCustomerReviewText").getText();
		
		String totalRating = rating.substring(0, rating.indexOf(" "));
		
		System.out.println(totalRating);
		
		driver.findElementById("add-to-cart-button").click();
		
		String cartConfirmation = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText();
		
		System.out.println(cartConfirmation);
		
		
		driver.findElementByXPath("(//a[@id='hlb-ptc-btn-native'])[1]").click();
		
		String pageTitle="Amazon Sign In";
		
		String loginPageTitle = driver.getTitle();
		
		
		System.out.println(loginPageTitle);
		
		
		if(pageTitle.equals(loginPageTitle)) {
			
			System.out.println("Page Title Matches: pass");
		}
		else {
			
			System.out.println("Page Title Doesnot Matches: Fail");
		}
		
		
		driver.findElementByXPath("(//input[@id='continue'])[1]").click();
		
		String expectedErrorMsg="Enter your email or mobile phone number";
		String actualErrorMsg = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		
		
		if(expectedErrorMsg.equals(actualErrorMsg)) {
			
			System.out.println("Error Message Mathces: Pass");
			
		}
		else
		{
			System.out.println("Error Message Do not Match: Fail");
		}
			
		driver.close();
		}
		
		}
	}

}
