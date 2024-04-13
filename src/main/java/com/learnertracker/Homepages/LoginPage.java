package com.learnertracker.Homepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;
//-----------------trainer------------------------------------------------------------------
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	@FindBy(xpath= "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath= "//a[@class='navbar-brand']")
	private WebElement expectedtxt;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void Login(String Username, String Password) throws InterruptedException
	{
		username.sendKeys(Username);
		Thread.sleep(2000);
		password.sendKeys(Password);
		Thread.sleep(2000);
	}
	public boolean assertion() {
		return expectedtxt.getText().toString().contains("LearnerTracker");
	}
	
}
