package com.FaceBook.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.FaceBook.pageObjects.LoginPage;
import com.FaceBook.utilities.ExcelUtils;

public class TC_LoginPage_DDT_001 extends BaseClass {

	@Test(dataProvider = "LogintestDDT" )
	public void LoginTestDDT(String usr, String pwd) throws Exception {

		driver.get(baseurl);
		LoginPage lp = new LoginPage(driver);
		
		lp.SetUserName(usr);
		lp.SetPassword(pwd
				);



		lp.LoginButton();
		System.out.println("Succesfully Logged In");


	}

	@DataProvider(name= "LoginTestDDT")

	public String [][] getData() throws Exception{

		String path = "F:\\Selenium-WorkPlace\\FaceBookV1\\src\\test\\java\\com\\FaceBook\\Testdata\\Test Data.xlsx" ;
		ExcelUtils exclutil = new ExcelUtils(path);

		int totalrows = ExcelUtils.getRowCount(path, "Credentials");
		int totalcol = ExcelUtils.getCellCount(path, "Credentials", 1);

		String LoginData[][] = new String[totalrows][totalcol]; 


		for(int i=1;i<=totalrows; i++) {

			for(int j=0; j<=totalcol; j++){

				LoginData[i-1][j] = ExcelUtils.getCellData(path, "Credentials", i, j); 
			}

		}
		return LoginData;

	}

}