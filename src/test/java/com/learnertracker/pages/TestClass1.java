package com.learnertracker.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnertracker.Homepages.TrainerDashBoard;
import com.learnertracker.Homepages.EditandDelete;
import com.learnertracker.Homepages.LoginPage;
import com.learnertracker.Homepages.PlacementOfficerDashboard;

public class TestClass1 extends BaseClass1 {
	LoginPage lgobj;
	TrainerDashBoard dobj;
	PlacementOfficerDashboard pobj;
	EditandDelete edobj;
	
		

	@Test(priority=1)
	public void TC_TH_002() throws InterruptedException {
		lgobj=new LoginPage(driver);
		dobj=new TrainerDashBoard(driver);
		lgobj.Login("","");
		dobj.button();
		Assert.assertEquals(true, dobj.assertionLog());
		System.out.println("Log in Failed : enter username and password");
		
	}
	@Test(priority=2)
	public void TC_TH_003() throws InterruptedException {
		driver.navigate().refresh();
		lgobj.Login("trainer", "");
		dobj.button();
		Assert.assertEquals(true, dobj.assertionLog());
		System.out.println("Log in Failed: enter password");
	}
	@Test(priority=3)
	public void TC_TH_004() throws InterruptedException {
		driver.navigate().refresh();
		lgobj.Login("","trainer@123");
		dobj.button();
		Assert.assertEquals(true, dobj.assertionLog());
		System.out.println("Log in Failed: enter username");
	}
	@Test(priority=4)
	public void TC_TH_005() throws InterruptedException {
		driver.navigate().refresh();
		lgobj.Login("train","trainer23");
		dobj.button();
		Assert.assertEquals(true, dobj.assertionLog());
		System.out.println("Log in Failed due to incorrect credentials");

		
	}

	@Test(priority=5)
	public void TC_TH_001() throws InterruptedException {
		lgobj=new LoginPage(driver);
		dobj=new TrainerDashBoard(driver);
		driver.navigate().refresh();
		lgobj.Login("trainer","trainer@123");
		dobj.button();
		Assert.assertEquals(true, lgobj.assertion());
		System.out.println("Trainer Logged in Successfully and navigated to learner dashboard");
	}
	@Test(priority=6)
	public void TC_LF_001() throws InterruptedException {
		dobj=new TrainerDashBoard(driver);
		dobj.addUser();
		dobj.Form("bb_50","",0,0,0,0);
		dobj.submit();
		Assert.assertEquals(true, dobj.assertion());
		System.out.println("Error message showing LearnerID 'Must contain letters,numbers and - only' ");
		
	}
	@Test(priority=7)
	public void TC_LF_002() throws InterruptedException {
		driver.navigate().refresh();
		dobj.Form("50","Ri34",1,1,1,1);
		dobj.submit();
		Assert.assertEquals(true, dobj.assertion());
		System.out.println("Error message showing  name 'Must contain letters only'");
	}
	@Test(priority=8)
	public void TC_LF_003() throws InterruptedException {
		driver.navigate().refresh();
		dobj.Form("50","Rishi",1,1,1,1);
		dobj.submit();
		dobj.alrt();
		Assert.assertEquals(true, lgobj.assertion());
		System.out.println("Learner added successfully");
	}
	@Test(priority=9)
	public void TC_LF_004() throws InterruptedException {
		driver.navigate().refresh();
		dobj.csvbtn();
		dobj.btnclick("D:\\Software Testing\\Main project\\ICT_LearnerTracker\\SampleCSV - Sheet1 (1).csv");
		dobj.submit2();
		dobj.returndash();
		dobj.alrtbtn();
		Assert.assertEquals(true, lgobj.assertion());
		System.out.println("Learner added successfully");
	}
	@Test(priority=10)
	public void TC_LG_001() throws InterruptedException {
		dobj.LogOut();
		dobj.logoutbtn();
		Assert.assertEquals(true, dobj.assertionLog());
		System.out.println("Trainer Head Logged out and navigated to Login Page");
	}
	@Test(priority=11)
	public void TC_PO_002() throws InterruptedException {
		driver.navigate().refresh();
		lgobj.Login("","");
		dobj.button();
		Assert.assertEquals(true, dobj.assertionLog());
		System.out.println("User not logged in : username and password field empty");
	}
	@Test(priority=12)
	public void TC_PO_003() throws InterruptedException {
		driver.navigate().refresh();
		lgobj.Login("pofficer","");
		dobj.button();
		Assert.assertEquals(true, dobj.assertionLog());
		System.out.println("No login activity: password field empty");
	}
	@Test(priority=13)
	public void TC_PO_004() throws InterruptedException {
		driver.navigate().refresh();
		lgobj.Login("","pofficer@123");
		dobj.button();
		Assert.assertEquals(true, dobj.assertionLog());
		System.out.println("No login activity: username field empty");
	}
	@Test(priority=14)
	public void TC_PO_005() throws InterruptedException {
		driver.navigate().refresh();
		lgobj.Login("POFFICER","pofficer");
		dobj.button();
		Assert.assertEquals(true, dobj.assertionLog());
		System.out.println("No user found : invalid credential");
	}
	
	@Test(priority=15)
	public void TC_PO_001() throws InterruptedException {
		driver.navigate().refresh();
		lgobj.Login("pofficer","pofficer@123");
		dobj.button();
		Assert.assertEquals(true, lgobj.assertion());
		System.out.println("Placement Officer Logged in and Navigated to Dashboard");
	}
	@Test(priority=16)
	public void TC_PS_001() throws InterruptedException {
		pobj =new PlacementOfficerDashboard(driver);
		pobj.update();
		pobj.pstatus(1);
		pobj.Submit();
		Assert.assertEquals(true, lgobj.assertion());
		System.out.println("Placement status updated and Navigated to Dashboard");
		
		
	}
	@Test(priority=17)
	public void TC_LG_002() throws InterruptedException {
		pobj.Logout();
		pobj.lgbutton();
		Assert.assertEquals(true, dobj.assertionLog());
		System.out.println("Placement officer Logged out and navigated to Login Page");
		
		
	}
	@Test(priority=18)
	public void TC_EF_001() throws InterruptedException {
		edobj=new EditandDelete(driver);
		lgobj.Login("trainer","trainer@123");
		dobj.button();
		Thread.sleep(2000);
		edobj.Edit();
		dobj.Form("50","Rishi",1,2,1,1);
		dobj.submit();
		Assert.assertEquals(true,lgobj.assertion());
		System.out.println("Learner details Edited Successfully");
		
	}
	@Test(priority=19)
	public void TC_DF_001() throws InterruptedException {
		edobj.Delete();
		Assert.assertEquals(true, lgobj.assertion());
		System.out.println("Learner details deleted from form and Logged out");
		dobj.LogOut();
		dobj.logoutbtn();
		
	}
	@Test(priority=20)
	public void TC_AD_001() throws InterruptedException {
		lgobj.Login("admin","admin@123");
		dobj.button();
		Assert.assertEquals(true, dobj.assertionLog());
		System.out.println("Admin not allowed to Log in");
	}
	
	
	}
