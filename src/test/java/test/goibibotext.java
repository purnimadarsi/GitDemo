package test;



import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class goibibotext {
	public static void verifyElementpresent(By locator,WebDriver driver)
	{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			driver.findElement(locator).click();
		
			
	}

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriverManager.chromedriver().setup();
	 		WebDriver  driver =  new ChromeDriver();
	 		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 		driver.get("https://www.goibibo.com/hotels/");
	 		driver.manage().window().maximize();
	 	//	driver.manage().
	 		//Thread.sleep(1000);
	 		driver.findElement(By.xpath("//h3[contains(text(),'India')]/parent::div/child::input")).click();
	 		WebElement ele1  = driver.findElement(By.id("downshift-1-input"));
	 	//	verifyElementpresent(ele1,driver);
	 	ele1.sendKeys("Oo");
	 	ele1.sendKeys(Keys.DOWN);
	 	Thread.sleep(1000);

	 	ele1.sendKeys(Keys.DOWN);
                 ele1.sendKeys(Keys.DOWN);

	 	ele1.sendKeys(Keys.DOWN);
	 	Thread.sleep(1000);
	 	ele1.sendKeys(Keys.ENTER);
	 //	ele1.sendKeys(Keys.ENTER);
	 //	ele1.sendKeys(Keys.ENTER);
	 	//driver.findElement(By.xpath("//ul[@id='downshift-1-menu']")).click();
	//System.out.println( driver.findElement(By.xpath("//ul[@id='downshift-1-menu']")).getText());
	
	
	 		
	 		//WebElement Ooty = driver.findElement(By.xpath("//li[@id='downshift-1-item-0']//child::div//following::span[text()='Ooty']"));
	 		////verifyElementpresent(Ooty,driver);
	 		//Ooty.click();
	 		
//	 		By locator;
//	 		
//	 		List<WebElement> webelements;
//	 		driver.findElement(By.xpath("//div[contains(text(),'Check-in')]")).click();
//	 		String selecteddate="";
//	 		 locator = By.xpath("//ul[contains(@class,'dcalendarstyles__DateWrapDiv')]//child::li[contains(@style,'black')]");
//	 		 webelements = driver.findElements(locator);
//	 		 selecteddate = "10";
//	 		for(int i=0;i<webelements.size();i++) {
//	 			String currentdate = driver.findElements(locator).get(i).getText();
//	 			if(selecteddate.equals(currentdate)) {
//	 				System.out.println("entered");
//	 				System.out.println(driver.findElements(locator).get(i).getText());
//	 				driver.findElements(locator).get(i).click();
//	 				break;
//	 			}
//	 		}
//	 		 locator = By.xpath("//ul[contains(@class,'dcalendarstyles__DateWrapDiv')]//child::li[contains(@style,'black')]");
//	 		 webelements = driver.findElements(locator);
//	 		 selecteddate = "16";
//	 		for(int i=0;i<webelements.size();i++) {
//	 			String currentdate = driver.findElements(locator).get(i).getText();
//	 			if(selecteddate.equals(currentdate)) {
//	 				System.out.println("entered");
//	 				System.out.println(driver.findElements(locator).get(i).getText());
//	 				driver.findElements(locator).get(i).click();
//	 				break;
//	 			}
//	 		}
//	 	//	driver.findElement(By.xpath("//span[text()='15']")).click();
	 		
	 	//	driver.findElement(By.xpath("//div[text()='Check-out']")).click();
	 		//verifyElementpresent(locator1,driver);
	 	
	 //	By locator = By.xpath("//li//child::span[text()=8]");
	 	//	verifyElementpresent(locator,driver);
	/*driver.findElement(By.xpath("//div[contains(@class,'SearchBlockUIstyles')]/span[contains(text(),'Rooms')]")).click();
	List<WebElement> elements =	driver.findElements(By.xpath("//div[contains(@class,'Layouts__Row-sc-1yzlivq-0 ')]//child::span[text()='+']"));
	for(WebElement element:elements) {
		element.click();
		element.click();
	}
	driver.findElement(By.xpath("//button[text()='Done']")).click();
	driver.findElement(By.xpath("//button[text()='Search Hotels']")).click();
	driver.close();*/
	}
	
	
	
}
