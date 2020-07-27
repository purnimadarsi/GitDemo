package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KSRTCBT {

	public static void main(String args[]) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
		WebDriver  driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("fromPlaceName"));
		ele.sendKeys("BENG");
		Thread.sleep(2000);
		ele.sendKeys(Keys.DOWN);
		//ele.sendKeys(Keys.DOWN);
		ele.sendKeys(Keys.UP);
		//not able to get text from the element ele 
		String city = ele.getText();
		System.out.println(city);
		
		//to get the text from hidden elements we use JavaScripExecutor
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			ele.sendKeys(Keys.DOWN);
			i++;
			 text = (String) js.executeScript(script);
			 if(i>10) {
				 break;
			 }
		}
		if(i>10) {
			System.out.println("element not forund");
		}else {
			System.out.println("element found");
		}
		
		
	}
		
}
