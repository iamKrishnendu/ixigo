package com.ixigo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ixigo.browser.BrowserHandler;

public class SearchFlightPage {
	
	public SearchFlightPage() {
		PageFactory.initElements(BrowserHandler.getDriver(), this);
	}

	@FindBy(css="div.form-fields input[autocomplete='new-password']")
	public List<WebElement>cities;
	
	@FindBy(xpath="//div[text()='From']//following::div[1]")
	public WebElement cityNameArea;
	
	@FindBy(xpath="//div[@class='airport']//preceding::div[1]")
	public List<WebElement> cityNames;
	
	@FindBy(xpath="//div[text()='Departure']//following::input[1]")
	public WebElement departureDate;
	
	@FindBy(xpath="(//div[@class='rd-month']//following::div[@class='rd-month-label'])[1]")
	public WebElement monthLabel;
	
	@FindBy(xpath="//table[@class='rd-days']//td[not(contains(@class,'day-disabled'))]//div[1]")
	public List<WebElement> dateRanges;
	
	@FindBy(css="button[class='ixi-icon-arrow rd-next']")
	public WebElement forwardButton;
	
	@FindBy(xpath="//div[text()='Travellers | Class']//following::input[1]")
	public WebElement travellersInputBox;
	
	@FindBy(css="div[class='u-box passanger-class-list flex-container']")
	public WebElement passengerListContainer;
	
	@FindBy(css="div.number-counter:nth-child(1) span")
	public List<WebElement>listofAdults;
	
	@FindBy(css="div.number-counter:nth-child(2) span")
	public List<WebElement>listofChildren;
	
	@FindBy(css="div.number-counter:nth-child(3) span")
	public List<WebElement>listofInfant;
	
	@FindBy(css="div[class='close-btn u-pos-abs ixi-icon-cross']")
	public WebElement passengerListCloseButton;
	
	@FindBy(css="div[class='search u-ib u-v-align-bottom'] div")
	public WebElement searchButton;
	
	@FindBy(css="div[data-rank='1']")
	public WebElement firstSummaryOfFlight;
	
	@FindBy(css="div.price-section div.price span:nth-child(2)")
	public List<WebElement>listOfFlightPrice;
	
	
	
	
}
