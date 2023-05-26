package login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Salesforce {

	public static void main(String[] args) {

		 String service = "C:\\Selenium\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", service);
		 
		 WebDriver driver = new ChromeDriver();			 
		 String url = "https://login.salesforce.com";				 
		 //Launch the Salesforce Website
		 driver.get(url);	 
		 
         //Maximize the browser  
         driver.manage().window().maximize(); 			 
		 
		 //Get Title
		// String errormsg = driver.getTitle();
		 System.out.println(driver.getTitle());
		 
		 //Get CurrentURL
		 String CurrentUrl = driver.getCurrentUrl(); 
		 
		 System.out.println(CurrentUrl);
		 
		//Get PageSource
		// String PageSource = driver.getPageSource(); 
		 System.out.println(driver.getPageSource());
		 
		 
		 if(CurrentUrl == url)
		 {
			 System.out.println("Verification Successful - The correct Url is opened.");   
		 }
		 else
		 {
			 System.out.println("Verification Failed - An incorrect Url is opened.");  
		 }
		  
		 
		 //Close Driver
		 driver.close();	
		 //Quit driver
		 driver.quit();
	}
}
