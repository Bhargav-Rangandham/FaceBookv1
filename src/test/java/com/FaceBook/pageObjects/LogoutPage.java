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
	
	@FindBy(xpath = "//*[@id=\"mount_0_0_SO\"]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/img")
	@CacheLookup
	WebElement ProfileClick;
	
	@FindBy(xpath ="//*[@id=\"mount_0_0_zP\"]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div")
	@CacheLookup
	WebElement txtLogoutbtn;

	
	public void ClickProfile() {

		ProfileClick.sendKeys();
	}


	public void Logoutbtn() {

		txtLogoutbtn.click();
	}
}
