package com.FaceBook.Testcases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.FaceBook.pageObjects.LoginPage;
import com.FaceBook.utilities.ExcelData;

public class TC_LoginPage_DDT_001 extends BaseClass {
	
	@Test
	public void LoginTestDDT() throws Exception {
		
		driver.get(baseurl);
		String ExcelPath = System.getProperty("user.dir")+"/src/test/java/com/FaceBook/Testdata/Test Data.xlsx";
		LoginPage lp = new LoginPage(driver);
		
		String user = ExcelData.getCellValue(ExcelPath, 1, 0);   
		lp.SetUserName(user);
		
		String pswd = ExcelData.getCellValue(ExcelPath, 1, 1);
		lp.SetPassword(pswd);
		
		lp.LoginButton();
		System.out.println("Succesfully Logged In");
		
				
	}
	
		/*@DataProvider(name= "LoginTestDDT" )
				
		String[][] getdata() throws Exception {
			int i = 0;
			int j = 0;
			
			
			
			int rownum = ExcelUtils.getRowCount(ExcelPath, "Credentials");
			int colcount = ExcelUtils.getCellCount(ExcelPath, "Credentials", 1);
			
			String LoginData[][] = new String[rownum][colcount]; 
			LoginData[i][j] = ExcelUtils.getCellData(ExcelPath, "Credentials", 1, 0); 
			
			
			return null;
			
		}*/
		
	
	

}
