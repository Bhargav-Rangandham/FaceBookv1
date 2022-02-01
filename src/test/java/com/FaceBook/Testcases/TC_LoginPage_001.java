package com.FaceBook.Testcases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.FaceBook.pageObjects.LoginPage;
import com.FaceBook.pageObjects.LogoutPage;

public class TC_LoginPage_001 extends BaseClass{

	@Test(priority = 0)
	public void LoginTest() throws Exception {

		driver.get(baseurl);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);		
		//Logger.info("Page Opened");

		LoginPage login = new LoginPage(driver);
		LogoutPage logout  = new LogoutPage(driver);

		login.SetUserName(username);
		login.SetPassword(password);

		login.LoginButton();

		System.out.println(driver.getTitle());
		
		takeScreenshot(driver, "LoginTest");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
		Assert.assertTrue(true);
		System.out.println("Test Case Passed");
		takeScreenshot(driver, "LoginTest");
		logout.ClickProfile();
		logout.Logoutbtn();

	}
	else {
		Assert.assertTrue(false);
		System.out.println("Test Case Failed");
		takeScreenshot(driver,"LoginTest");
		logout.ClickProfile();
		logout.Logoutbtn();
		
	}
		*/
		
		logout.ClickProfile();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		logout.Logoutbtn();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}

}



