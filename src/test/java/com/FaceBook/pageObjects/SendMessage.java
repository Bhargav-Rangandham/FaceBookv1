package com.FaceBook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessage {
	
	WebDriver ldriver;
	
	public SendMessage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	
	@FindBy(xpath = "//span[text() = 'Bhargav Naidu']")
	@CacheLookup
	WebElement txtContacts;
		
	
	@FindBy(xpath = "//div[text() = 'Aa']")
	@CacheLookup
	WebElement txtMsg;
	
	
	
	public void SelectContacts() {
		txtContacts.click();
	}
	
	
	public void TypeMessage( String Msg) {
		txtMsg.sendKeys(Msg);
	}
}
