package com.ixigo.test;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ixigo.base.Base;
import com.ixigo.library.GenericKeywords;
import com.ixigo.library.PropertFileHandler;
import com.ixigo.pages.SearchFlightPage;

public class TestSuite extends Base   {

	SearchFlightPage searchPage = null;
	GenericKeywords keyword = null;
	PropertFileHandler prop = new PropertFileHandler();
	String fromCity,toCity,departureDate=null;
	String noOfAdult,noOfChildren,noOfInfant=null;
	@BeforeTest
	public void initializePages() {
		fromCity= prop.getPropertyValues().get("from").toString();
		toCity = prop.getPropertyValues().get("to").toString();
		departureDate = prop.getPropertyValues().get("departure").toString();
		noOfAdult = prop.getPropertyValues().get("adults").toString();
		noOfChildren = prop.getPropertyValues().get("children").toString();
		noOfInfant = prop.getPropertyValues().get("infant").toString();
		searchPage = new SearchFlightPage();
		keyword = new GenericKeywords();
	}

	@Test(description="TC will launch ixigo.com page and search for flight and record the details")
	
	public void launch_application_search_flight() throws InterruptedException {
		System.out.println("Under Test");
		logger = extent.createTest("To search flights and filter out sorted flight details based upon the price");
		keyword.performClick(searchPage.cities.get(0));
		logger.info("From City selected successfully as "+fromCity);
		keyword.enterText(searchPage.cities.get(0),fromCity);
		logger.info("To City selected successfully as "+toCity);
		Assert.assertEquals(keyword.checkValueAndSelect(searchPage.cityNames,fromCity), true);
		logger.pass("From city value selected from the suggestion box successfully");
		keyword.performClick(searchPage.cities.get(1));
		keyword.enterText(searchPage.cities.get(1),toCity);
		Assert.assertEquals(keyword.checkValueAndSelect(searchPage.cityNames,toCity), true);
		logger.pass("To city value selected from the suggestion box successfully");
		keyword.performClick(searchPage.departureDate);
		Assert.assertEquals(keyword.lookForDateAndSelect(departureDate), true);
		logger.pass("Departure date has been selected from the suggestion box successfully");
		keyword.performClick(searchPage.travellersInputBox);
		Assert.assertEquals(keyword.selectPassengers(noOfAdult,"adult"), true);
		Assert.assertEquals(keyword.selectPassengers(noOfChildren,"children"), true);
		Assert.assertEquals(keyword.selectPassengers(noOfInfant,"infant"), true);
		logger.pass("Travellers details selected from the suggestion box successfully");
		keyword.performClick(searchPage.passengerListCloseButton);
		keyword.performClick(searchPage.searchButton);
		Assert.assertEquals(keyword.sortFlightPrices("6000"), true);
		logger.pass("Flight prices published successfully");
		
		
		
	}
	
	

}
