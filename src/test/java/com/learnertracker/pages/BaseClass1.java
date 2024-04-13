package com.learnertracker.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass1 {
	WebDriver driver;
	@BeforeTest
	public void config() {
		driver=new ChromeDriver();
		driver.get("https://learnertracker.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@AfterTest
	public void Final() {
		System.out.println("All test cases executed!");
		
	}

}
