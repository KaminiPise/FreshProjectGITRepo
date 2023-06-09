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

public class ContactsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	SpeakingPage speakingPage;
	ContactsPage contactsPage;
	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		homePage = new HomePage();
		contactsPage=homePage.clickOnContactsLink();
		contactsPage = new ContactsPage();
	}
	
	@Test(priority=1)
	public void verifyContactsPageLabelTest() {
		 Assert.assertTrue(contactsPage.verifyContactLabel());
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}
