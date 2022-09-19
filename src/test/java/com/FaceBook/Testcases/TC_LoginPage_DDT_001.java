package com.FaceBook.Testcases;

import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.FaceBook.pageObjects.LoginPage;
import com.FaceBook.pageObjects.ProfileClickPage;
import com.FaceBook.utilities.ExcelUtils;

public class TC_LoginPage_DDT_001 extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void LoginTestDDT(String usr, String pwd) throws Exception {

		driver.get(baseurl);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.SetUserName(usr);
		lp.SetPassword(pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		lp.LoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		takeScreenshot(driver, "LoginTestDDT");
		
		System.out.println("Succesfully Logged In");
		
		ProfileClickPage logout  = new ProfileClickPage(driver);
		
		logout.ClickProfile();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		logout.Logoutbtn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

	}

	@DataProvider(name="LoginData")
	public String [][] getData() throws Exception{

		String path = "R:\\WorkSpace\\FaceBookv1\\FaceBookv1\\src\\test\\java\\com\\FaceBook\\Testdata\\TestData.xlsx" ;
		int rownum = ExcelUtils.getRowCount(path, "Credentials");
		int colcount = ExcelUtils.getCellCount(path, "Credentials", 1);

		String loginData[][] = new String[rownum][colcount]; 

		for(int i=1;i<=rownum; i++) {

			for(int j=0; j<colcount; j++){

				loginData[i-1][j] = ExcelUtils.getCellData(path, "Credentials", i, j); 
			}
		}
		return loginData;

	}

}