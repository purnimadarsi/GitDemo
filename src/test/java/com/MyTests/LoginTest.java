package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;
import com.utill.JiraPolicy;

public class LoginTest extends BaseTest{

	@JiraPolicy(logTicketReady=true)
	@Test(priority=1)
	public void verfiyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	@JiraPolicy(logTicketReady=true)
	@Test(priority=2)
	public void verfiyLoginPageHeaderTest() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account?");
	}
	@JiraPolicy(logTicketReady=true)
	@Test(priority=3,enabled=false)
	public void doLoginTest() {
		HomePage homepage = 	page.getInstance(LoginPage.class).doLogin("naveenanimation2@gmail.com","Test@12345");
		String headerHome = homepage.getHomePageHeader();
		System.out.println(headerHome);
		Assert.assertEquals(headerHome, "Getting started with HubSpot");
	}
}
