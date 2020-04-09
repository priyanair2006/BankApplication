package com.bank.qa.test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bank.qa.base.TestBase;
import com.bank.qa.pages.LoginPage;
import com.bank.qa.utils.GetSS;

public class LoginTest extends TestBase{
	public  LoginPage login;
	LoginTest()
	{
		super();
		
	}
	@Parameters("browser")
	@BeforeMethod
	void setup(String browser)
	{
		 initialization(browser);	
		 login = new LoginPage();
		
	}
	@Test
	public void LoginBank()
	{
	
	 boolean logo= login.logodisplay();
	 Assert.assertTrue(logo, "Digital Bank");
	 login.clickuname(read.getemail());
	 login.clickpwd(read.getpwd());
	 login.clickbtn();
	 logger.info("login successful");
	 GetSS.TakeScreenShot();
	 
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
