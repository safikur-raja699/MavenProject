package com.automation.pacakages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.learnautomation.utility.Browserfactory;
import com.learnautomation.utility.ConfigDataProvider;

public class BaseClass {
	public WebDriver driver;
	public static Logger logger;
	ConfigDataProvider config=new ConfigDataProvider();
	@BeforeClass
	public void setup() {
		logger=Logger.getLogger("Framework");
		PropertyConfigurator.configure("log4j.properties");
		//driver= Browserfactory.startApplication( driver, config.getBrowser(), config.getsatgingUrl());
		driver=Browserfactory.startApplication(driver, config.geteFirefox(), config.getsatgingUrl());
		logger.info("open url");
		if(driver.getTitle().equalsIgnoreCase("TABLT Pharmacy - Buy Medicine, Tablets Online | TABLT.com"))
				{
			Assert.assertTrue(true);
			logger.info("open url");
			
				}
		else
		{
			Assert.assertFalse(false);
			logger.info("open url");
		}
		
		
		}
	@AfterClass
	public void tearDown() {
		Browserfactory.closeBbrowser();
		
	}
	

}
