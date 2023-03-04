package com.automation.pacakages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.DataDriven;

public class LoginPage {
	WebDriver driver;
	ConfigDataProvider config=new ConfigDataProvider();
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//button[contains(text(),'LOGIN')]") WebElement login;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]") WebElement email1;
	@FindBy(xpath="//button[contains(text(),'SEND OTP')]") WebElement otp;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]") WebElement otp1;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]") WebElement otp2;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]") WebElement otp3;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]") WebElement otp4;
	@FindBy(xpath="//button[contains(text(),'VERIFY')]") WebElement verify; 
public void loginCrm(String email,String otp5,String otp6,String otp7,String otp8) {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
	}
	login.click();
	
	
	email1.sendKeys(email);
	otp.click();
	otp1.sendKeys(otp5);
	otp2.sendKeys(otp6);
	otp3.sendKeys(otp7);
	otp4.sendKeys(otp8);
	verify.click();
	
	
}
}