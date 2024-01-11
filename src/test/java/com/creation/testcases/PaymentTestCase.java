package com.creation.testcases;

import org.testng.annotations.Test;

import com.creation.pages.BaseTest;
import com.creation.pages.DashboardOption;
import com.creation.pages.DashboardPage;
import com.creation.pages.LoginPage;
import com.creation.pages.PaymentPage;
import com.creation.utilities.ReadExcelFile;

public class PaymentTestCase extends BaseTest{
	

	String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";
	
	@Test(priority =1)
	void testcourses()
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(username, password);
		
		DashboardPage dp = new DashboardPage(driver);
		
		dp.dashboardclick();
		
		PaymentPage pg= new PaymentPage(driver);
		String crdnum=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 0);
		String expdate=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 1);
		String cvcnum=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 2);
		
		pg.paymentOption(crdnum, expdate, cvcnum);
		
	}
}
