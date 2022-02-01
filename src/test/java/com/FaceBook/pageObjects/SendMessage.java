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

	@FindBy(xpath = "//input[@type='search']")
	@CacheLookup
	WebElement txtSearch;
	
	
	@FindBy(xpath = "//span[text() = 'Bhargav Naidu']")
	@CacheLookup
	WebElement txtContacts;
		
	
	@FindBy(xpath = "//div[@aria-label=\"Message\" and @ role =\"textbox\"]")   //div[text() = 'Aa']
	@CacheLookup
	WebElement txtMsg;
	
		
	@FindBy(xpath = "//div[@aria-label=\"Press Enter to send\" and @ role =\"button\"]")
	@CacheLookup
	WebElement SendMsg;
	
	public void SearchBox(String text) {
		txtSearch.sendKeys(text);;
	}
	
	
	public void SelectContacts() {
		txtContacts.click();
	}
	
	
	public void TypeMessage( String Msg) {
		txtMsg.sendKeys(Msg);
	}
	
	public void SendMsg() {
		SendMsg.click();
	}
}
