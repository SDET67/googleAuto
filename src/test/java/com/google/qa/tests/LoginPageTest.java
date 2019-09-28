package com.google.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.qa.base.TestBase;
import com.google.qa.pages.LoginPage;
import com.google.qa.pages.SignInPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	SignInPage signInPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest() {
		String loginPageTitle = loginPage.verifyLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "Google", "Login Page Title not matched");
	}
	
	@Test(priority=2)
	public void verifyDisplayLogoTest() {
		boolean displayLogo = loginPage.verifyDisplayLogo();
		Assert.assertTrue(displayLogo);
	}
	
	@Test(priority=3)
	public void verifySignInPageDisplayTest() {
		signInPage = loginPage.verifySignIn();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
