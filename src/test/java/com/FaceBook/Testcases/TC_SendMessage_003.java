package com.FaceBook.Testcases;

import java.time.Duration;
import org.testng.annotations.Test;
import com.FaceBook.pageObjects.LoginPage;
import com.FaceBook.pageObjects.ProfileClickPage;
import com.FaceBook.pageObjects.SendMessage;

public class TC_SendMessage_003 extends BaseClass {
	
	@Test
	public void SendMessage() throws Exception {
		
		driver.get(baseurl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage lp = new LoginPage(driver);
		ProfileClickPage lt = new ProfileClickPage(driver);
		SendMessage sm = new SendMessage(driver);
		
		lp.SetUserName(username);
		lp.SetPassword(password);
		lp.LoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		sm.SelectContacts();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		sm.TypeMessage("Hello Bhargav :), This is Auto Generated Message");
		
		sm.SendMsg();
		
		takeScreenshot(driver, "SendMessage");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		lt.ClickProfile();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		lt.Logoutbtn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.close();
		
		
	}

}
