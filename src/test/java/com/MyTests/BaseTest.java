package com.MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypages.BasePage;
import com.mypages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
         system.out.println("changed the code in the basetest");
	public  WebDriver driver;
	public Page page;
	@BeforeMethod
	@Parameters(value= {"browser"})
	public void SetUpTest(String browser) throws InterruptedException {
		if(browser.equals("chrome")) {
			System.out.println("entered");
			WebDriverManager.chromedriver().setup();
		//	System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.get("http://app.hubspot.com/login");
		}else if(browser.equals("ff")){
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}else {
			System.out.println("no browser is defined in testngxml");
		}
		driver.get("http://app.hubspot.com/login");
		try {
		Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		page =new BasePage(driver);
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("aftermethod****************************");
		driver.quit();
	}

}
