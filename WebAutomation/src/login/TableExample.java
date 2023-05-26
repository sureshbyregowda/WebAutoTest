package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		 String service = "C:\\Selenium\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", service);
		 WebDriver driver = new ChromeDriver();

		 //Launch the Online Store Website
		 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23267/pak-vs-sl-2nd-t20i-sri-lanka-tour-of-pakistan-2019");
         //Maximize the browser  
        driver.manage().window().maximize(); 
        
		WebElement Table = driver.findElement(By.cssSelector("#innings_1[class='ng-scope'] [class='cb-col cb-col-100 cb-ltst-wgt-hdr']:nth-child(1)"));
		 
	    List <WebElement> element = Table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] [class='cb-col cb-col-8 text-right text-bold']"));
	    
	    int oSize = element.size();
	    
	    int sum = 0;
	    //#innings_1[class='ng-scope'] [class='cb-col cb-col-100 cb-ltst-wgt-hdr']:nth-child(1) [class='cb-col cb-col-100 cb-scrd-itms'] [class='cb-col cb-col-8 text-right text-bold']
	    
	    for(int i=0;i<oSize;i++)
	    {
	    	
	      System.out.println(element.get(i).getText());

	    }
	    		
	   // #innings_1[class='ng-scope'] [class='cb-col cb-col-100 cb-ltst-wgt-hdr']:nth-child(1) [class='cb-col cb-col-100 cb-scrd-itms'] [class='cb-col cb-col-8 text-right text-bold']	
	    	//	driver.findElement(By.cssSelector("#innings_1[class='ng-scope'] [class='cb-col cb-col-100 cb-ltst-wgt-hdr']:nth-child(1) "));
		    //  [class='cb-col cb-col-100 cb-scrd-itms'] [class='cb-col cb-col-8 text-right text-bold']
		
	    
	     //div[@id='innings_1']//div[@class='cb-col cb-col-60'][text()='Extras']/following-sibling::div[1]
		 WebElement ExtraRuns = driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-60'][contains(text(),'Extras')]/following-sibling::div[1]"));
		 
         System.out.println(ExtraRuns.getText());
         
       //div[@id='innings_1']//div[@class='cb-col cb-col-60'][text()='Total']/following-sibling::div[1]
         WebElement Totalruns = driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-60'][contains(text(),'Total')]/following-sibling::div[1]")); 
         System.out.println(Totalruns.getText());
         
         driver.close();
         driver.quit();
	}

}
