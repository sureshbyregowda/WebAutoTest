package login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebPage {

	public static void main(String[] args) {
		 String service = "C:\\Selenium\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", service);
		 WebDriver driver = new ChromeDriver();
		 
		 //Launch the Online Store Website
		 driver.get("http://demo.guru99.com/test/guru99home/");
		 
		 driver.manage().window().maximize();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
	     // This  will scroll down the page by  1000 pixel vertical		
		 
	     js.executeScript("window.scrollBy(0,1000)");		 //Scroll Page by Pixel
	}

}

 class ScrollWebPageByVisibilityofElement {

	public static void main(String[] args) {
		 String service = "C:\\Selenium\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", service);
		 WebDriver driver = new ChromeDriver();
		 
		 //Launch the Online Store Website
		 driver.get("http://demo.guru99.com/test/guru99home/");
		 
		 driver.manage().window().maximize();
		 
		//Find element by link text and store in variable "Element"   
		 WebElement element = driver.findElement(By.linkText("Linux"));
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		//This will scroll the page till the element is found		
	     js.executeScript("arguments[0].scrollIntoView();", element);	 //Scroll WebPage by Visibility of element
	     
	}

	 static class ScrollWebPageTillEndofWebPage {

			public static void main(String[] args) {
				 String service = "C:\\Selenium\\chromedriver.exe";
				 System.setProperty("webdriver.chrome.driver", service);
				 WebDriver driver = new ChromeDriver();
				 
				 //Launch the Online Store Website
				 driver.get("http://demo.guru99.com/test/guru99home/");
				 
				 driver.manage().window().maximize();
				 			 
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 
				//This will scroll the web page till end.		
			     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			     
			     //"document.body.scrollHeight" returns the complete height of the body i.e web page.
			}	
	 }
	
	 static class ScrollWebPageHorizontally {

			public static void main(String[] args) {
				 String service = "C:\\Selenium\\chromedriver.exe";
				 System.setProperty("webdriver.chrome.driver", service);
				 WebDriver driver = new ChromeDriver();
				 
				 //Launch the Online Store Website
				 driver.get("http://demo.guru99.com/test/guru99home/");
				 
				 driver.manage().window().maximize();
				 			 
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 
				//Find element by link text and store in variable "Element"   
				 WebElement element = driver.findElement(By.linkText("VBScript"));		 
				 
				 //This will scroll the page Horizontally till the element is found			     
			     js.executeScript("arguments[0].scrollIntoView();", element);

			}	
	 }	 
	 
	
	
	
   }
