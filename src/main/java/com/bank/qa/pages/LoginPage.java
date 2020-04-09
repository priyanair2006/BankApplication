package com.bank.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=("//input[@id='username']"))
	WebElement username;
	
	@FindBy(xpath=("//input[@id='password']"))
	WebElement password;
	
	@FindBy(xpath=("//button[@id='submit']"))
	WebElement submitbtn;
	
	@FindBy(xpath=("//*[@class='align-content']"))
	WebElement dbbank;
	
	public void clickuname(String uname)
	{
		username.sendKeys(uname);
		logger.info("user name entered");
	}
	
	public void clickpwd(String pwd)
	{
		password.sendKeys(pwd);
		logger.info("password entered");
	}
	public void clickbtn()
	{
		submitbtn.click();
		logger.info("button clicked");
	}
	
	public boolean logodisplay()
	{
		return dbbank.isDisplayed();
	}
}
