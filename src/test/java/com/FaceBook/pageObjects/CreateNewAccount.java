package com.FaceBook.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount {

	WebDriver lDriver;

	public CreateNewAccount(WebDriver rDriver)
	{
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}


	/* @FindBy(xpath = "//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	@CacheLookup
	WebElement btnCreateAccount; */


	@FindBy(xpath = "//input[@name ='firstname']")
	@CacheLookup
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@name ='lastname']")
	@CacheLookup
	WebElement txtLastName;

	@FindBy(xpath = "//input[@name ='reg_email__']")
	@CacheLookup
	WebElement txtRegisterEmail; 

	@FindBy(xpath = "//input[@name = 'reg_email_confirmation__']")
	@CacheLookup
	WebElement txtReenterEmail; 

	@FindBy(id = "password_step_input")
	@CacheLookup
	WebElement txtSetPassword;

	@FindBy(xpath = "//select[@id='day']")
	@CacheLookup
	WebElement txtSetDOB; //Date of Birth

	@FindBy(xpath = "//select[@id='month']")
	@CacheLookup
	WebElement txtSetMOB; //Date of Moth

	@FindBy(xpath = "//select[@id='year']")
	@CacheLookup
	WebElement txtSetYOB; // Month of year

	@FindBy(xpath = "//input[@class= '_8esa'][1]")
	@CacheLookup
	WebElement btnGenderFemale; //
	
	@FindBy(xpath = "//input[@id= 'u_0_5_+B']")
	@CacheLookup
	WebElement btnGenderMale;

	@FindBy(xpath = "//input[@id= 'u_0_6_Ux']")
	@CacheLookup
	WebElement btnGenderCustom; //
	
	//input[@name= 'custom_gender']


	@FindBy(xpath = "//button[@name='websubmit']")
	@CacheLookup
	WebElement btnCreatenewAccount;



	/* public void CreateAccountLink() {

		btnCreateAccount.click();
	} */

	public void SetFirstname(String Fname) {
		txtFirstName.sendKeys(Fname);

	}


	public void SetLastName(String Lname) {
		txtLastName.sendKeys(Lname);
	}


	public void SetRegisterEmail(String RegEmail) {

		txtRegisterEmail.sendKeys(RegEmail);
	}

	public void SetReEnterEmail(String RegEmail) {

		txtReenterEmail.sendKeys(RegEmail);
	}

	public void SetNewPassword(String NewPswrd) {
		txtSetPassword.sendKeys(NewPswrd);

	}


	public void SetDate(String DOB) {
		txtSetDOB.sendKeys(DOB);
	}


	public void SetMonth(String MOB) {

		txtSetMOB.sendKeys(MOB);
	}

	public void SetYear(String MOY) {
		txtSetYOB.sendKeys(MOY);

	}


	public void SetGenderMale() {
		btnGenderMale.click();
	}


	public void SetGenderFemale() {

		btnGenderFemale.click();
	}

	public void SenderGenderCustom() {
		btnGenderCustom.click();

	}


	public void btnCreateLink() {
		btnCreatenewAccount.click();
	}


}

