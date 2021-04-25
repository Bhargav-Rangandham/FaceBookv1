package com.FaceBook.Testcases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import com.FaceBook.pageObjects.CreateNewAccount;

public class TC_CreateNewAccount_002 extends BaseClass {
	
	@Test
	public void CreateAccount() throws Exception  {
		
				driver.get(createacnturl);
		
		CreateNewAccount createacnt = new CreateNewAccount(driver);
		
		createacnt.SetFirstname("CheckUp");
		
		createacnt.SetLastName("Checkup");
		
		createacnt.SetRegisterEmail("checkup123@gmail.com");
		
		createacnt.SetReEnterEmail("checkup123@gmail.com");
		
		createacnt.SetNewPassword("checkup@2369");
		
		createacnt.SetDate("07");
		
		createacnt.SetMonth("May");
		
		createacnt.SetYear("1999");
		
		createacnt.SetGenderFemale();
				
		createacnt.btnCreateLink();
		
		takeScreenshot(driver, "CreateAccount");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		driver.close();
	}
	
	

}
