package com.google.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.qa.base.TestBase;
import com.google.qa.pages.LoginPage;
import com.google.qa.pages.SignInPage;

public class SignInPageTest extends TestBase {
	
	LoginPage loginPage;
	SignInPage signInPage;
	
	public SignInPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		signInPage = loginPage.verifySignIn();
	}
	
	@Test(priority=1)
	public void verifySignInPageTitleTest() {
		String signInTitle = driver.getTitle();
		Assert.assertEquals(signInTitle, "Sign in - Google Accounts", "Sign In Page Title not matched");
	}
	
	@Test(priority=2)
	public void verifySignInAccountTest(String un, String pwd) throws InterruptedException {
		 signInPage.verifySignInAccount( prop.getProperty("username"));
		
		//loginPage = signInPage.verifySignInAccount( "testengineer67@gmail.com", "SDET$123");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
