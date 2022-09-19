package com.FaceBook.Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.FaceBook.pageObjects.LoginPage;
import com.FaceBook.pageObjects.ProfileClickPage;


public class TC_ChangePassword_004 extends BaseClass {
	
	@Test
	public void ChangePassword() throws Exception {
		
		driver.get(baseurl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPage login = new LoginPage(driver);
		
		login.SetUserName(username);
		login.SetPassword(password);
		
		login.LoginButton();
		
		ProfileClickPage profile = new ProfileClickPage(driver);
		
		profile.ClickProfile();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		profile.Settings_privacyPage();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		profile.SettingsPage();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		profile.Security_loginpage();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@tabindex='0']"));
		
		driver.switchTo().frame(frame);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		profile.edit_password();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		profile.oldPassword("Test@2021");
		
		profile.newPassword("Jobs@2022");
		
		profile.confirmPassword("Jobs@2022");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//profile.btn_passwordchange();
		
		//takeScreenshot(driver, "ChangePassword");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		profile.ClickProfile();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		profile.Logoutbtn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
