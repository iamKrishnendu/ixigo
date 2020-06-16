package com.ixigo.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ixigo.base.Base;

public class TestClass extends Base   {

//	public TestClass(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}

	@Test(description="TC will launch ixigo.com page and search for flight and record the details")
	
	public void launch_application_search_flight() {
		System.out.println("Under Test");
	}
	
	

}
