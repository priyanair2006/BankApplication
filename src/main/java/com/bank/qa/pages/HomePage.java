package com.bank.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='menu-item-has-children dropdown']")
	WebElement dropdown;
	@FindBy(xpath="//*[text()='New Checking']")
	WebElement newcheck;
	@FindBy(xpath="//*[@type='radio'][@name='accountType']")
	List<WebElement> accnttype;
	@FindBy(xpath="//*[@type='radio'][@name='ownershipType']")
	List<WebElement> accntowner;
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement name;
	@FindBy(id="openingBalance")
	WebElement opening;
	@FindBy(xpath="//*[@class='btn btn-primary btn-sm']")
	WebElement submitbtn;
	
	
	public void clickchecking()
	{
		dropdown.click();
	}
	public void clicknewcheck()
	{
		newcheck.click();
	}
	
	public void clickAccountType()
	{
		//int i=accnttype.size();
		
		for(int i =0;i<accnttype.size();i++)
		{
			String str =accnttype.get(i).getAttribute("id");
			System.out.print(str);
			
			if ( str.equals("Standard Checking"))
			{
				accnttype.get(i).click();
			}
		}
	}
	
	
	
	public void clictdata(String aname,String amount)
	{
		name.sendKeys(aname);
		opening.sendKeys(amount);
		submitbtn.click();
	}
	public void clickAccountOwner() {
		for(int i =0;i<accntowner.size();i++)
		{
			String str =accntowner.get(i).getAttribute("id");
			System.out.print(str);
			if (str.equals("Individual"))
			{
				accntowner.get(i).click();
			}
		}
		
	}
	
	

}
