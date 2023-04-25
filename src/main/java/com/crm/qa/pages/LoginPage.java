package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//Page Factory - OR:
		@FindBy(id="email")
		WebElement username;
		
		@FindBy(id="pass")
		WebElement password;
		
		@FindBy(id="u_0_9_Nu")
		WebElement loginBtn;
		
		@FindBy(id="u_0_0_ZA")
		WebElement createNewAccount;
		
		@FindBy(xpath="//img[contains(@class,'fb_logo _8ilh img')]")
		WebElement crmLogo;
		
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
	
		public boolean validateCRMImage(){
			return crmLogo.isDisplayed();
		}
		
		public HomePage login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			    	
			return new HomePage();
		}
}
