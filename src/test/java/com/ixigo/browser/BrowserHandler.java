package com.ixigo.browser;

import java.io.File;
import java.io.InputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.ixigo.base.Base;

public class BrowserHandler extends Base {

	 WebDriver driver;
//	public BrowserHandler(WebDriver driver) {
//		super(driver);
//		this.driver=driver;
//		}
	
	public void launchApplication(String browser, String url) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File("src/test/resources/driver/chromedriver_83.exe");
		System.out.println(file.getAbsolutePath());
		ChromeOptions options = new ChromeOptions();
		
		switch(browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			options.addArguments("");
			driver = new ChromeDriver();
			driver.get(url);
			
		}
	}

}
