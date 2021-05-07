package com.FaceBook.Testcases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.FaceBook.pageObjects.LoginPage;
import com.FaceBook.pageObjects.LogoutPage;
import com.FaceBook.pageObjects.SendMessage;

public class TC_SendMessage_003 extends BaseClass {
	
	@Test
	public void SendMessage() {
		
		driver.get(baseurl);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		LogoutPage lt = new LogoutPage(driver);
		SendMessage sm = new SendMessage(driver);
		
		lp.SetUserName(username);
		lp.SetPassword(password);
		lp.LoginButton();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		sm.SelectContacts();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		sm.TypeMessage("Hello Bhargav :), This is Auto Generated Message");
		
		
		
		
		
		
		
		
		
		
	}

}
