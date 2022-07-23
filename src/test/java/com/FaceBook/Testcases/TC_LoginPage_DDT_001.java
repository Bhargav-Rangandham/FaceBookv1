package com.FaceBook.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.FaceBook.pageObjects.LoginPage;
import com.FaceBook.utilities.ExcelUtils;

public class TC_LoginPage_DDT_001 extends BaseClass {
	
	@Test(dataProvider = "TestData" )
	public void LoginTestDDT(String usr, String pwd) throws Exception {

		driver.get(baseurl);
		LoginPage lp = new LoginPage(driver);
		
		lp.SetUserName(usr);
		lp.SetPassword(pwd);

		lp.LoginButton();
		System.out.println("Succesfully Logged In");

	}

	@DataProvider(name= "TestData")
	public String [][] getData() throws Exception{

		String path = "R:\\WorkSpace\\Automation\\FaceBookv1\\src\\test\\java\\com\\FaceBook\\Testdata\\TestData.xlsx" ;
		int rownum = ExcelUtils.getRowCount(path, "Credentials");
		int colcount = ExcelUtils.getCellCount(path, "Credentials", 1);

		String LoginData[][] = new String[rownum][colcount]; 

		for(int i=1;i<=rownum; i++) {

			for(int j=0; j<=colcount; j++){

				LoginData[i-1][j] = ExcelUtils.getCellData(path, "Credentials", i, j); 
			}
		}
		return LoginData;

	}

}