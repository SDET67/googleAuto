package com.google.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	// page factory --- declare OR of that page
	@FindBy(xpath="//*[@id=\"gb_70\"]")
	WebElement signInBtn;
	
	@FindBy(xpath="//a[contains(text(),'Gmail')]")
	WebElement gmailLink;
	
	@FindBy(xpath="//a[contains(title(),'Google apps')]")  
	WebElement appsLink;
	
	@FindBy(xpath="//a[contains(text(),'Images')]")
	WebElement imagesLink;
	
	@FindBy(xpath="//img[contains(@title,'Google’s 21st Birthday')]")
	WebElement gLogoLink;
	
	// create class constructor init driver to this class obj
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyDisplayLogo() {
		return gLogoLink.isDisplayed();
	}
	
	public SignInPage verifySignIn() {
		signInBtn.click();
		return new SignInPage();
				
	}

} 
