package com.learinautomation.testcases;


import org.testng.annotations.Test;


import org.openqa.selenium.support.PageFactory;

import com.automation.pacakages.BaseClass;
import com.automation.pacakages.LoginPage;


public class loginTestCrm extends BaseClass {
	
	
	
	
	@Test
	public void loginApp() {
		
	
	
	LoginPage loginPage=PageFactory.initElements(driver ,LoginPage.class);
	
	loginPage.loginCrm("9864475234", "2", "0", "2", "2");
	
	}  
	
}  
 