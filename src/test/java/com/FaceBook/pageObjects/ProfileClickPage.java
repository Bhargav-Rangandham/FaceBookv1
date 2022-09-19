package com.FaceBook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileClickPage {

	WebDriver lDriver;

	public ProfileClickPage(WebDriver rDriver)
	{
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath = "//*[@aria-label = 'Your profile' and @role ='img']")
	@CacheLookup
	WebElement ProfileClick;
	
	@FindBy(xpath ="//span[text() = 'Log Out']")
	@CacheLookup
	WebElement txtLogoutbtn;

	@FindBy(xpath = "//span[text()='Settings & privacy']")
	@CacheLookup
	WebElement link_Settings_privacy;
	
	@FindBy(xpath="//span[text()='Settings']")
	@CacheLookup
	WebElement link_settings;
	
	@FindBy(xpath="//span[text()='Security and login']")
	@CacheLookup
	WebElement link_Security_login;
	
	@FindBy(xpath="//span[text()='Change password']")  
	@CacheLookup
	WebElement changepassword; 
	
	@FindBy(xpath="//input[@id='password_old']")
	@CacheLookup
	WebElement old_password;
	
	@FindBy(xpath="//input[@id='password_new']")
	@CacheLookup
	WebElement new_password;
	
	@FindBy(xpath="//input[@id='password_confirm']")
	@CacheLookup
	WebElement confirm_new_password;
	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	WebElement btn_Confirm_passowrd;
	
	public void ClickProfile() {

		ProfileClick.click();
	}


	public void Logoutbtn() {

		txtLogoutbtn.click();
	}
	
	public void Settings_privacyPage() {
		link_Settings_privacy.click();
	}
	
	public void SettingsPage() {
		link_settings.click();
	}
	
	public void Security_loginpage() {
		link_Security_login.click();
	}
	
	public void edit_password() {
		changepassword.click();
		
	}
	
	public void oldPassword(String oldpswrd) {
		old_password.sendKeys(oldpswrd);
	}
	
	public void newPassword(String newpswrd) {
		new_password.sendKeys(newpswrd);
	}
	
	public void confirmPassword(String cnfmpswrd) {
		confirm_new_password.sendKeys(cnfmpswrd);
	}
	
	public void btn_passwordchange() {
		btn_Confirm_passowrd.click();
	}
	
}
