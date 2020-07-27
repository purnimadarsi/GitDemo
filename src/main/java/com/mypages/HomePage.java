package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class HomePage extends BasePage{
	
	private By header = By.className("private-page_title");

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	public WebElement getHeader() {
		return getElement(header);
            System.out.println("hello");
	}

	

	
	public String getHomePageTitle() {
		return getPageTitle();
	}

	

	
	public String getHomePageHeader() {
		return getPageHeader(header);
	}

}
