package com.learnertracker.Homepages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TrainerDashBoard {
	WebDriver driver;
	
	@FindBy(xpath= "//button[@class='btn btn-success w-100']")
	private WebElement bttn;
	@FindBy(xpath="//div[@class='container w-75 mt-4 pt-4']//child::button[1]")
	private WebElement AddUser;
	
	@FindBy(xpath= "//*[@id='learnerid']")
	private WebElement LearnerID;
	@FindBy(xpath= "//*[@id='name']")
	private WebElement Name;
	@FindBy(xpath= "//*[@name='course']")
	private WebElement Course;
	@FindBy(xpath= "//*[@name='project']")
	private WebElement Project;
	@FindBy(xpath= "//*[@name='batch']")
	private WebElement Batch;
	@FindBy(xpath= "//*[@name='cstatus']")
	private WebElement CourseStatus;
	@FindBy(xpath= "//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/div/div/div[7]/div/div[2]/button")
	private WebElement Submit;
	@FindBy(xpath="/html/body/div[2]/div/div[6]/button[1]")
	private WebElement alrtbtn;
	
	@FindBy(xpath="//*[@class='dropdown-toggle nav-link']")
	private WebElement logout;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//div[@class='container w-50 mt-5 pt-5  bg-secondary-subtle rounded']/h3")
	private WebElement expected;
	
	@FindBy(xpath="//p[text()='ICTAK - Learner Tracker']")
	private WebElement expectedLogout;
//-----------csv file -----------------------------------------------------------
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/main/div/a[2]/button")
	private WebElement csv;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/form/div[1]/input")
	private WebElement csvfileadd;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/form/button")
	private WebElement submit;
	
	@FindBy(xpath="/html/body/div[2]/div/div[6]/button[1]")
	private WebElement returndash;
	
	@FindBy(xpath="/html/body/div[2]/div/div[6]/button[1]")
	private WebElement okbtn;
	
	public TrainerDashBoard(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	public void button() throws InterruptedException
	{
		bttn.click();
		Thread.sleep(2000);
	}
	public void addUser() {
		AddUser.click();
	}
	
	public void Form(String ID , String name, int a, int b , int c, int d) throws InterruptedException {
		LearnerID.sendKeys(ID);
		Thread.sleep(1000);
		Name.sendKeys(name);
		Thread.sleep(1000);
		
		Select dropdown1= new Select(Course);
		dropdown1.selectByIndex(a);
		Thread.sleep(1000);
		
		Select dropdown2= new Select(Project);
		dropdown2.selectByIndex(b);
		Thread.sleep(1000);
		
		Select dropdown3= new Select(Batch);
		dropdown3.selectByIndex(c);
		Thread.sleep(1000);
		
		Select dropdown4= new Select(CourseStatus);
		dropdown4.selectByIndex(d);
		Thread.sleep(1000);
		
	}
	public void submit() throws InterruptedException {
		Submit.click();
		Thread.sleep(2000);
	}
	public void alrt() throws InterruptedException{
		alrtbtn.click();
		Thread.sleep(2000);
	}
	public void LogOut() throws InterruptedException{
		logout.click();
		Thread.sleep(1000);
		
	}
	public void logoutbtn() throws InterruptedException{
		logoutbtn.click();
		Thread.sleep(1000);
		
	}
	public boolean assertion() {
		return expected.getText().toString().contains("Learner's form");
	}
	public boolean assertionLog() {
		return expectedLogout.getText().toString().contains("ICTAK - Learner Tracker");
	}
	public void csvbtn() throws InterruptedException {
		csv.click();
		Thread.sleep(2000);
	}
	public void btnclick(String file) {
		csvfileadd.sendKeys(file);
	}
	public void submit2() {
		submit.click();
	}
	public void returndash() throws InterruptedException {
		returndash.click();
		Thread.sleep(2000);
	}
	public void alrtbtn() throws InterruptedException {
	
		okbtn.click();
	}
	
}
