package com.creation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	//constructor
	public DashboardPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"login-list\"]/li[1]/a") 
	WebElement dashboardClick ;
	
	@FindBy(xpath = "//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a")
	WebElement offerAcademics;
	
	@FindBy(xpath = "//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button")
	WebElement subscribeBtn ;
	
	public void dashboardclick()
	{
		dashboardClick.click();
		offerAcademics.click();
		subscribeBtn.click();
		
		}
}
