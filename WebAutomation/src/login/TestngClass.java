package login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestngClass {
	
    public String service = "C:\\Selenium\\chromedriver.exe";
	public WebDriver driver; 
	 
  @Test
  public void logintest() { 
	  
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username entered");
       
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password entered");
       
       driver.findElement(By.xpath("//input[@id='Login']")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	         System.setProperty("webdriver.chrome.driver", service);	  
	         driver = new ChromeDriver();	
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	 
	        //Launch the Online Store Website	 
	        driver.get("https://login.salesforce.com");	  	  
  }

  @AfterMethod
  public void afterMethod() {
	     // Close the driver
 	  
         driver.quit();	  
  }

}
