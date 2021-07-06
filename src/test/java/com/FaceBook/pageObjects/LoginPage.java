package com.FaceBook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver lDriver;

	public LoginPage(WebDriver rDriver)
	{
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	
	@FindBy(name = "email")
	@CacheLookup
	WebElement txtEmail;
  
	@FindBy(name = "pass")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(name = "login")
	@CacheLookup
	WebElement txtbtnLogin;

	
	public void SetUserName(String uname) {

		txtEmail.sendKeys(uname);
	}


	public void SetPassword(String pwd) {

		txtPassword.sendKeys(pwd);
	}

	public void LoginButton() {

		txtbtnLogin.click();
	}

	
}
