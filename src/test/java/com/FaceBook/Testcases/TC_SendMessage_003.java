package com.FaceBook.Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.FaceBook.pageObjects.LoginPage;
import com.FaceBook.pageObjects.LogoutPage;
import com.FaceBook.pageObjects.SendMessage;

public class TC_SendMessage_003 extends BaseClass {
	
	@Test
	public void SendMessage() throws Exception {
		
		driver.get(baseurl);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		LogoutPage lt = new LogoutPage(driver);
		SendMessage sm = new SendMessage(driver);
		
		lp.SetUserName(username);
		lp.SetPassword(password);
		lp.LoginButton();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		sm.SelectContacts();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		sm.TypeMessage("Hello Bhargav :), This is Auto Generated Message");
		
		sm.SendMsg();
		
		takeScreenshot(driver, "SendMessage");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		lt.ClickProfile();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		lt.Logoutbtn();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.close();
		
		
	}

}
