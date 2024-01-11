package com.creation.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.creation.pages.BaseTest;
import com.creation.pages.LoginPage;
import com.creation.utilities.ReadExcelFile;

public class LoginTest extends BaseTest {
	
	@Test
	void varifyLogin() {
		
		LoginPage lp = new LoginPage(driver);
		String username = "Demo12";
		String password = "Test123456$";
		lp.loginPortal(username, password);
	}
	
	
}
