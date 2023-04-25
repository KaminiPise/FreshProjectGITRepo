//author Kamini Pise

package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath = "//h1[contains(text(),'Automation Panda')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Speaking')]")
	WebElement speakingLink;
	

	@FindBy(xpath = "//a[contains(text(),'Books')]")
	WebElement booksLink;

	@FindBy(xpath = "//a[contains(text(),'BDD')]")
	WebElement bDDLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public SpeakingPage clickOnSpeakingLink(){
		speakingLink.click();
		return new SpeakingPage();
	}
	
	public BooksPage clickOnBooksLink(){
		booksLink.click();
		return new BooksPage();
	}

	
	
	
	
}
