package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {
		File src=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("not able load config");
		} 
	}
	public String getDataFromconfig(String keyToSearch) {
		return pro.getProperty(keyToSearch);
		
	}
	public String getBrowser() {
		String Browser=pro.getProperty("Browser");
		return Browser;
	}
	public String getsatgingUrl() {
		String qaURL= pro.getProperty("qaURL");
		return qaURL;
		
	}
	public String geteFirefox() {
		String Browser2= pro.getProperty("Browser2");
		return Browser2;
		
	}
	
	
}
