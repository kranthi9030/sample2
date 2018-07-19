package com.test.automation.uiautomation.uiactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
;

public class Homepage 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement loginEmailaddress;
	
	@FindBy(xpath="//*[@id='pass']")
	WebElement Password;
	 
	@FindBy(xpath="//*[@value='Log In']")
	WebElement loginbtn;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void  loginapp(String Emailaddress, String pswd)
	{
		loginEmailaddress.sendKeys(Emailaddress);
		Password.sendKeys(pswd);
		loginbtn.click();
	}
	
	
}
