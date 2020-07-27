package com.MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReportsBasicDemo {
	public static void main(String[] args) {
                system.out.println("changed the code in the basicdemo");
		//start Reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();

		extent.attachReporter(htmlReporter);
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("Google search Test one","This is  test to validate google search functionality");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
          
		
		test1.log(Status.INFO, "starting test case");
		
		driver.get("http://www.google.com");
		test1.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).click();
		test1.pass("Entered text in searchbox");
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Pressed KeyBorad enter Key");
		driver.close();
		driver.quit();
		test1.pass("closed the browser");
		test1.info("Test Completed");
		
		ExtentTest test2 = extent.createTest("Google search Test two","This is  test to validate google search functionality");

		WebDriverManager.chromedriver().setup();

		WebDriver driver1 = new ChromeDriver();
          
		
		test2.log(Status.INFO, "starting test case");
		
		driver1.get("http://www.google.com");
		test2.pass("Navigated to google.com");
		driver1.findElement(By.name("q")).sendKeys("Automation");
		driver1.findElement(By.name("q")).click();
		test2.pass("Entered text in searchbox");
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		driver1.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.fail("Pressed KeyBorad enter Key");
		driver1.close();
		driver1.quit();
		test2.pass("closed the browser");
		test2.info("Test Completed");
		//calling flush writes everything to the log file
		extent.flush();




	}






}
