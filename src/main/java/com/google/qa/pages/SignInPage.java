package com.google.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.qa.base.TestBase;

public class SignInPage extends TestBase{
	
	//Page factory
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/ul/li[2]/div/div/div[2]")
	WebElement anotherAcc;
	
	@FindBy(id="identifierId")
	WebElement username;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")
	WebElement nextBtn1;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span")
	WebElement nextBtn2;
	
	//define constuctor
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifySignInPageTitle() {
		return driver.getTitle();
	}
	

	/* public void verifySignInAccount(String un) throws InterruptedException {
	
		anotherAcc.click();
		username.sendKeys(un);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		nextBtn.click();
		Thread.sleep(2000); 
		return new LoginPage(); 
	} */

	public void verifySignInAccount(String un) throws InterruptedException {
		// TODO Auto-generated method stub
		anotherAcc.click();
		username.sendKeys(un);
		Thread.sleep(2000);
	}
	
}
