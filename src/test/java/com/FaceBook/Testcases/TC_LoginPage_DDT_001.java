package com.FaceBook.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.FaceBook.pageObjects.LoginPage;
import com.FaceBook.utilities.ExcelUtils;

public class TC_LoginPage_DDT_001 extends BaseClass {
	
	@Test
	public void LogintestDDT() throws IOException {
		
		driver.get(baseurl);
		
		LoginPage lp = new LoginPage(driver);
		
		
		String usrn = ExcelUtils.getCellData(username, password, 1, 0);
		String pswrd = ExcelUtils.getCellData(username, password, 1, 1);
		lp.SetUserName(usrn);
		lp.SetPassword(pswrd);
		
		lp.LoginButton();
		System.out.println("Succesfully Logged In");
		
		
		
	}
	

}
