package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver = null;
	
	public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		 driver =  new ChromeDriver();
		
		driver.get("https://google.com");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
	//	GoogleSearchPage.textbox_search(driver).click();
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	     driver.close();
		
	}
	public static void main(String[] args) {
		googleSearch();
	}

}
