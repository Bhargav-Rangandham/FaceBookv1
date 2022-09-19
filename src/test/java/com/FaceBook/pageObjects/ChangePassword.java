package com.FaceBook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword {
	
	WebDriver ldriver;
	
	public Changepassword(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@aria-label = 'Your profile' and @role ='img']")
	@CacheLookup
	WebElement ProfileClick;
	
	@FindBy(xpath ="//span[text() = 'Log Out']")
	@CacheLookup
	WebElement txtLogoutbtn;

	
	public void ClickProfile() {

		ProfileClick.click();
	}


}
