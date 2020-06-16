package com.ixigo.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ixigo.browser.BrowserHandler;

public class Base {
	
	 WebDriver driver;
	
	
	@BeforeClass
	
	public void setUpApplication() {
		BrowserHandler launchApp = new BrowserHandler();
		launchApp.launchApplication("Chrome", "https://www.ixigo.com/");
		
	}
	
	
	
	@AfterClass
	public void closeApplication() {
		
		
	}

}
