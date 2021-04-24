package com.FaceBook.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {

		File src = new File("./Configuration//config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}
		catch (Exception e) {
			System.out.println("Exception is"+ e.getMessage());

		}
	}

	public String getApplicationUrl() {
		String url = prop.getProperty("baseurl");
		return url;

	}

	public String getUserName() {
		String UserName = prop.getProperty("username");
		return UserName;

	}


	public String getPassword() {
		String Password = prop.getProperty("password");
		return Password;

	}
	
	public String getChromePath() {
		String ChromePath = prop.getProperty("chromepath");
		return ChromePath;

	}
	
	public String getFirefoxPath() {
		String FirefoxPath = prop.getProperty("firefoxpath");
		return FirefoxPath;

	}
	/*
	
	public String getPassword() {
		String Password = prop.getProperty("Password");
		return Password;

	}*/



}
