package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	public static void main(String[] args) {
		 String service = "C:\\Selenium\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", service);
		 WebDriver driver = new ChromeDriver();
		 
		 //Launch the Online Store Website
		 driver.get("http://www.qaclickacademy.com/interview.php");
		 
		 //Identify Appium tab using absolute xpath  ( Parent to Child )
		 
		 WebElement AppiumTab = driver.findElement(By.xpath("/html/body/section/div/div/div/div/ul/li[1]"));
		 
		 //Identify Appium tab using Id -- Relative xpath ( find locating element - starting from anywhere in between documents)
		 
		 driver.findElement(By.xpath("//li[@id='tablist1-tab1']"));  
		 
		 //Identify Appium tab using text()
		 
		 driver.findElement(By.xpath("//li[text()='Appium']"));
		 
		 // Traverse between Siblings
		 
		 WebElement SeleniumTab = driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]"));
		 
		 WebElement SoapUITab = driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]"));
		 
		 WebElement TestingTab = driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[3]"));

		 //Traverse from Child to Parent ( finding Parent xpath using child xpath )
		 
		 driver.findElement(By.xpath("//li[@id='tablist-tab1']/parent::ul"));
 
		 
	}

}
