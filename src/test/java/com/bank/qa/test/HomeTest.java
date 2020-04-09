package com.bank.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bank.qa.base.TestBase;
import com.bank.qa.pages.LoginPage;
import com.bank.qa.pages.HomePage;
import com.bank.qa.utils.GetSS;

public class HomeTest extends TestBase {

	public  LoginPage login;
	public  HomePage homepg;
	
	HomeTest()
	{
		super();
	}
	
	@Parameters("browser")
	@BeforeMethod
	void setup(String browser)
	{
		 initialization(browser);	
		 login = new LoginPage();
		 
		 login.clickuname(read.getemail());
		 login.clickpwd(read.getpwd());
		 login.clickbtn();
		 logger.info("login successful");
	}
	
	@Test
	public void HomePageaccess()
	{
	
	 homepg = new HomePage();
	 homepg.clickchecking();
	 homepg.clicknewcheck();
	 homepg.clickAccountType();
	 homepg.clickAccountOwner();
	 
	 homepg.clictdata(read.getacntname(), read.getacntamnt());
	 GetSS.TakeScreenShot();
	 
	 
	
	 
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
