package com.hotels.automation.steps;

import com.hotels.automation.framework.TestBase;
import com.hotels.automation.page.Guest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GuestTest extends TestBase {

	public Guest guest;
	
    @And("click on guest")
    public void clickOnGuest(){
        guest = new Guest(driver);
        guest.clickToGuest();
    }

    @And("select {string} adults")
    public void selectAdult(String adults){
    	guest.selectNumberOfAdult(adults);
    }

    @And("select {string} children")
    public void selectChild(String child){
    	guest.selectNumberOfChild(child);
    }

    @And("select age is {string} for first child")
    public void selectFirstChild(String age){
    	guest.selectAgeForFirstChild(age);
    }

    @And("select age is {string} for second child")
    public void selectSecondChild(String value){
    	guest.selectAgeForSecondChild(value);
    }

    @Then("verify number of adults and children")
    public void verifyAdultChild(){
    	Assert.assertTrue(guest.isNumberOfAdultChild());
    }

    @When("click apply")
    public void clickToApply(){
    	guest.clickToApply();
    }

    @Then("verify {string} number of guests")
    public void totalGuest(String total){
    	Assert.assertTrue(guest.isTotalGuests(total));
    }
}
