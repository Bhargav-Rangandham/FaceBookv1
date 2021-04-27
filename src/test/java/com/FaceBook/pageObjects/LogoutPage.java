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
	
	@FindBy(xpath = "//img[@class = 's45kfl79 emlxlaya bkmhp75w spb7xbtv']")
	@CacheLookup
	WebElement ProfileClick;
	
	@FindBy(xpath ="//span[@class = 'd-8edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m']")
	@CacheLookup
	WebElement txtLogoutbtn;

	
	public void ClickProfile() {

		ProfileClick.click();
	}


	public void Logoutbtn() {

		txtLogoutbtn.click();
	}
}
