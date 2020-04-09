package com.bank.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {
	FileInputStream ip;
	Properties prop;
	public ReadFile()
	{
		prop= new Properties();
		
		try {
			ip = new FileInputStream("D:\\Automation\\BankingFramework\\src\\main\\java\\com\\bank\\qa\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public String geturl()
	{
		String url=prop.getProperty("url");
		return url;
	}
	public String getemail()
	{
		String uname=prop.getProperty("username");
		return uname;
	}
	public String getpwd()
	{
		String pwd=prop.getProperty("password");
		return pwd;
	}
	public String getacntname()
	{
		String aname=prop.getProperty("aname");
		return aname;
	}
	public String getacntamnt()
	{
		String amount=prop.getProperty("amount");
		return amount;
	}
}
