package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserfactory {
	@Parameters("browser")
	
	public static WebDriver startApplication(WebDriver driver, String BrowserName, String Url ) {
		if(BrowserName.equals("Chrome")) {
			 WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(); 
			driver.manage().timeouts().pageLoadTimeout(30, 	TimeUnit.SECONDS);
			
		}
		else if(BrowserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(); 
			driver.manage().timeouts().pageLoadTimeout(30, 	TimeUnit.SECONDS);
			
		}
else if(BrowserName.equals("IE")) {
			
		}
else {
	System.out.println(" we dont show browser");
}
		driver.manage().timeouts().pageLoadTimeout(30, 	TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeBbrowser() {}

}
