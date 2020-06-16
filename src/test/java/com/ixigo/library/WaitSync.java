package com.ixigo.library;

import java.time.Duration;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;



public class WaitSync{
	
	PropertFileHandler prop = new PropertFileHandler();
	
	public WebElement pollingElement(WebDriver driver, final WebElement locator) 
	{
		int timeOut = Integer.parseInt(prop.getPropertyValues().get("timeout").toString());
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver driver) {
				return locator;
				}
		});
		return element;
	}
	
}
