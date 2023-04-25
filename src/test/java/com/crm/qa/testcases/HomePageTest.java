package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SpeakingPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	SpeakingPage speakingPage;
	ContactsPage contactsPage;
//	TestUtil testUtil; 
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
//		testUtil = new TestUtil();
		loginPage = new LoginPage();	
		homePage = new HomePage();
		contactsPage = new ContactsPage();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle= homePage.verifyHomePageTitle();
Assert.assertEquals(homePageTitle, "Automation Panda | A blog for software development and testing", "Home page title not matched");
}
	
	@Test(priority = 2)
	public void verifyUserName() {
//		testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName()); 
	}
	 
	@Test(priority=3)
	public void verifyContactsLinkTest(){
		contactsPage = homePage.clickOnContactsLink();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
