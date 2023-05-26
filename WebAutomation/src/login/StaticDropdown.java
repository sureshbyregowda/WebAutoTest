package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		 String service = "C:\\Selenium\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", service);
		 WebDriver driver = new ChromeDriver();
		 
		 //Launch the Online Store Website
		 driver.get("http://www.spicejet.com");
		 
        //Maximize the browser  
        driver.manage().window().maximize(); 
        
        //Select Tag for Static Dropdown list
        
       // WebElement city = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
       // Select citydropdownlist = new Select(city);
        
        //Or
        
        Select citydropdownlist = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));        
        
        citydropdownlist.selectByIndex(0);
        
        Thread.sleep(800);
        
        citydropdownlist.selectByValue("USD");
        
        Thread.sleep(800);
        
        citydropdownlist.selectByVisibleText("INR");
        
        Thread.sleep(800);
        
        citydropdownlist.selectByVisibleText("AED");
        
        
      List <WebElement>  element = citydropdownlist.getOptions();      
      System.out.println(element.size());      
      int size = element.size();      
      for(int i=0;i<size;i++)
      {
    	  String sValue = element.get(i).getText();
    	  
    	  if(sValue.equals("INR"))
    	  {
    		  citydropdownlist.selectByIndex(i) ;
    	  }
    	  
    	  System.out.println(sValue);    	  
      } 
              
	}
}
