package com.FaceBook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	WebDriver lDriver;

	public LogoutPage(WebDriver rDriver)
	{
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath = "//*[@aria-label = \"Your profile\" and @role =\"img\" ]")
	@CacheLookup
	WebElement ProfileClick;
	
	@FindBy(xpath ="//span[text() = 'Log Out']")
	@CacheLookup
	WebElement txtLogoutbtn;

	
	public void ClickProfile() {

		ProfileClick.click();
	}


	public void Logoutbtn() {

		txtLogoutbtn.click();
	}
}
