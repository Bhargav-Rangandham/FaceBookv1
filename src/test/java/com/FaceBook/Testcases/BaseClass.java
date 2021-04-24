package com.FaceBook.Testcases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.FaceBook.utilities.ReadConfig;

public class BaseClass {
	
		ReadConfig readconfig = new ReadConfig();
		
		public String baseUrl = readconfig.getApplicationUrl();
		public String UserName = readconfig.getUserName();
		public String Password = readconfig.getPassword();
		public static WebDriver driver;
		//public static Logger logger;
		
		
		@Parameters("browser")
		@BeforeClass
		public void SetUp(String br) {
			
			/*
			Logger = Logger.getLogger("FaceBook");
			PropertyConfigurator.configure("Log4j.properties");
			
			*/
			
			if(br.equals("chrome")) {
				
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			//Another way of setting properties
			//System.setProperty("WebDriver.chrome.driver", System.setPropety("user.dir)+"Drivers/chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifcations");
			driver = new ChromeDriver(opt);
			driver.manage().window().maximize();
			}
			
			else if(br.equals("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
				FirefoxOptions opt1 = new FirefoxOptions();
				opt1.addArguments("--disable-notifcations");
				driver = new FirefoxDriver(opt1);				
				
				driver.manage().window().maximize();
			
			}
			
		}
		
		/*@AfterClass
		public void tearDown() {
			
			driver.quit();
		}*/
		
		/*public boolean IsalertPresent () {
			
			try {
				
				driver.switchTo().alert();
				return true;
			}
			catch(Exception e){
				
				return false;
				
			}
			
		}*/
		
		public void takeScreenshot(WebDriver driver, String tname) throws IOException {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("F:\\Selenium-WorkPlace\\FaceBookV1\\Screenshots\\HomePage.png");
			//File dest = new File(System.getProperty("user.dir") + "/Screenshots/" + tname +".png");
			FileHandler.copy(src,dest);
			System.out.println("Screenshots Taken");
			
		}

	}


