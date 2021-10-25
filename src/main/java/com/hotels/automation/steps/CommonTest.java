package com.hotels.automation.steps;

import com.hotels.automation.framework.TestBase;
import com.hotels.automation.page.Common;

import io.cucumber.java.en.Given;

public class CommonTest extends TestBase {
	
	public Common common;

	 @Given("launch application")
	 public void launchAppln(){
		 common = new Common(driver);
	 }
}
