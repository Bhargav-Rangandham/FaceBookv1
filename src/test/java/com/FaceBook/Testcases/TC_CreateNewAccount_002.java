package com.FaceBook.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.FaceBook.pageObjects.CreateNewAccount;

public class TC_CreateNewAccount_002 extends BaseClass {
	
	@Test
	public void CreateAccount() {
		
				driver.get(createacnturl);
		
		CreateNewAccount createacnt = new CreateNewAccount(driver);
		
		/*createacnt.CreateAccountLink();
		
		WebElement acntframe = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/iframe"));
		driver.switchTo().frame(acntframe); */
		
		createacnt.SetFirstname("CheckUp");
		
		createacnt.SetLastName("Checkup");
		
		createacnt.SetRegisterEmail("checkup123@gmail.com");
		
		createacnt.SetReEnterEmail("checkup123@gmail.com");
		
		createacnt.SetNewPassword("checkup@2369");
		
		createacnt.SetDate("05");
		
		createacnt.SetMonth("Apr");
		
		createacnt.SetYear("1999");
		
		createacnt.SetGenderMale();
		
		createacnt.btnCreateLink();
		
		
	}
	
	

}
