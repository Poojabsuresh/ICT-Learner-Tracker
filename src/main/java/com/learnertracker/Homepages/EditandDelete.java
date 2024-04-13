package com.learnertracker.Homepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditandDelete {
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='container w-75 mt-4 pt-4']//following::button[4]")
	private WebElement edit;
	@FindBy(xpath="//div[@class='container w-75 mt-4 pt-4']//following::button[5]")
	private WebElement delete;
	
	public EditandDelete(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	public void Edit() throws InterruptedException {
		edit.click();
		Thread.sleep(4000);
	}
	public void Delete() throws InterruptedException {
		delete.click();
		Thread.sleep(2000);
		
	}
	

}
