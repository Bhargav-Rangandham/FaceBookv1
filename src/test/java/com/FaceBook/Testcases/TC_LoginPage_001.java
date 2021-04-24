package com.FaceBook.Testcases;

import java.io.IOException;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.FaceBook.pageObjects.LoginPage;


public class TC_LoginPage_001 extends BaseClass{

	@Test(priority = 0)
	public void Logintest() throws Exception {

		driver.get(baseurl);
		
		Thread.sleep(5000);
		
		//Logger.info("Page Opened");

		LoginPage login = new LoginPage(driver);

		login.SetUserName(username);
		login.SetPassword(password);

		login.LoginButton();

		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);

		/*if(IsalertPresent() == true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);	
			
			}
			else {
				
			Assert.assertTrue(true);
				
			} */
		

	/*	 if(driver.getTitle().equals("Facebook – log in or sign up")) {

			Assert.assertTrue(true);
			System.out.println(" Test Case Passed");
			takeScreenshot(driver,"Logintest");

		}
		else {
			Assert.assertTrue(false);
			System.out.println("Test Case Failed");


			takeScreenshot(driver,"Logintest");
		}
	}
*/
	
	
	/*@Test(priority = 0)
	public void Logouttest() {

		driver.get(BaseUrl);

		LogoutPage logout  = new LogoutPage(driver);

		logout.ClickProfile();
		logout.ClickLogout();


}*/
	}
}

