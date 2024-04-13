package com.learnertracker.Homepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PlacementOfficerDashboard {
	WebDriver driver;
	@FindBy(xpath="//div[@class='container w-75 mt-5 pt-5']//following::button[2]")
	private WebElement update;
	@FindBy(xpath="//*[@name='pstatus']")
	private WebElement pstatus;
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//*[@id='basic-nav-dropdown']")
	private WebElement Logout;
	
	@FindBy(xpath="//*[@id='basic-navbar-nav']/div/div/div/a[2]")
	private WebElement lgbutton;
	
	
   
	public PlacementOfficerDashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void update() throws InterruptedException
	{
		update.click();
		Thread.sleep(3000);
	}
	public void pstatus(int a) throws InterruptedException
	{
		Select dropdown = new Select(pstatus);
		dropdown.selectByIndex(a);
		Thread.sleep(3000);
	}
	public void Submit() throws InterruptedException
	{
		submit.click();
		Thread.sleep(2000);
	}
	public void Logout() throws InterruptedException
	{
		Logout.click();
		Thread.sleep(2000);
	}
	public void lgbutton() throws InterruptedException
	{
		lgbutton.click();
		Thread.sleep(2000);
	}
	
	

}
