package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	static WebDriver driver = null;
      public static void main(String[] args) throws InterruptedException {
    	  googleSearchTest();
	}
      
      public static void googleSearchTest() throws InterruptedException {
    	  WebDriverManager.chromedriver().setup();
 		 driver =  new ChromeDriver();
 		
 		driver.get("https://google.com");
 		
 		GoogleSearchPageObjects searchpageobj = new GoogleSearchPageObjects(driver);
 		searchpageobj.setTextInSearchBox("Automation Step by step");
 		searchpageobj.clickSearchButton();
 		driver.close();
      }
}
