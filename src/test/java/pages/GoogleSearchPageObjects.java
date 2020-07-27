package pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPageObjects {

	WebDriver driver=null;
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
//	
//	@FindBy(id="lst_ib")
//	WebElement textbox_search ;
//	@FindBy(name="btnk")
//    WebElement button_Search;	
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	public void setTextInSearchBox(String text) {
	driver.findElement(textbox_search).sendKeys(text);
	}
	public void clickSearchButton() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}
