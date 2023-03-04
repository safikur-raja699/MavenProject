package com.learnautomation.utility;

import org.testng.annotations.DataProvider;

public class DataDriven {
	@DataProvider
	public Object[][] dataset() {
		Object[][] dataset= new Object[0][4];
		dataset[0][0]="9864475234";
		dataset[0][1]="2";
		dataset[0][2]="0";
		dataset[0][3]="2";
		dataset[0][4]="2";
		
		return dataset;
	}

}
