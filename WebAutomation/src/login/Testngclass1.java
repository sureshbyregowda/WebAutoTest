package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngclass1 {

    public String service = "C:\\Selenium\\chromedriver.exe";
	public WebDriver driver; 
	 
  @Test
  public void logintest() { 
	  
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username entered");
       
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password entered");
       
       driver.findElement(By.xpath("//input[@id='Login']")).click();
	  
       System.out.println("Login Successful");
  }
  
  @Parameters("browser")
  @BeforeTest
  public void CreateDriverInstance(String browser) {
	  
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		 service = "C:\\Selenium\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", service);	  
         driver = new ChromeDriver();	
         	 
	  }
	  else if(browser.equalsIgnoreCase("ie"))
	  {
		 service = "C:\\Selenium\\IEDriverServer.exe";
         System.setProperty("webdriver.ie.driver", service);	  
         driver = new InternetExplorerDriver();			  
	  }
	  else
	  {
		 service = "C:\\Selenium\\\\geckodriver.exe";
         System.setProperty("webdriver.gecko.driver", service);	  
         driver = new FirefoxDriver();			
           
	  }

	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
      //Launch the Online Store Website	
      driver.get("https://login.salesforce.com");	  	  
  }

  @AfterMethod
  public void quitbrowser() {
	     // Close the driver
 	  
         driver.quit();	  
         System.out.println("quit browser");
  }

}