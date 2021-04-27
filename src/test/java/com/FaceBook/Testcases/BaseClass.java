package com.FaceBook.Testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.FaceBook.utilities.ReadConfig;


public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public String baseurl = readconfig.getApplicationUrl();
	public String createacnturl = readconfig.getAccountCreateUrl();
	public String username = readconfig.getUserName();
	public String password = readconfig.getPassword();
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
			opt.addArguments("chrome.switches","--disable-notifications --disable-extensions --disable-extensions-file-access-check --disable-extensions-http-throttling --disable-infobars --enable-automation --start-maximized");
			opt.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

			//opt.addUserProfilePreference("credentials_enable_service", false);
			// opt.addUserProfilePreference("profile.password_manager_enabled", false);

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

	public String timestamp() {

		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		return timestamp;
	}

	public void takeScreenshot(WebDriver driver, String tname) throws IOException {

		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + timestamp()+".png");
		FileHandler.copy(src, dest);

	}

}



