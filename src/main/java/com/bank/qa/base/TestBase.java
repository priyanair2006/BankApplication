package com.bank.qa.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.bank.qa.utils.ReadFile;

public class TestBase {
	public static WebDriver driver;
	public ReadFile read;
	public static Logger logger;
	public  TestBase()
	{
	  read = new ReadFile();
      logger=Logger.getLogger(TestBase.class);
	  DOMConfigurator.configure("Log4j.xml");
	
	 	 	
	}

public void initialization(String browser)
	{
	   if (browser.equalsIgnoreCase("Chrome"))
	   {
	    System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(read.geturl());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		logger.info("Driver initiated");
	   }
	   else if(browser.equalsIgnoreCase("Ie")) {
		   
		   
	   }
	}

}
