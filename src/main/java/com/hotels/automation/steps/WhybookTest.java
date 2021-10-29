package com.hotels.automation.steps;

import org.testng.Assert;

import com.hotels.automation.framework.TestBase;
import com.hotels.automation.page.Whybook;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class WhybookTest extends TestBase {

	public Whybook whybook;
	
	@And("go to Why book with Hotels.com section")
	public void goToWhyBookSection(){
		whybook = new Whybook(driver);
		whybook.navigateToHotels("https://www.hotels.com/");
		whybook.scrollToWhybookSection();
	}
	
	@Then("verify {string} free text with icon is displayed")
	public void verifyFreeText(String expecteddata){
		Assert.assertEquals(expecteddata, whybook.verifyFreeCancelText());
	}
	
	@Then("verify {string} price text with icon is displayed")
	public void verifyOurPriceText(String expecteddata){
		Assert.assertEquals(expecteddata, whybook.verifyPriceGuaranteeText());
	}
	
	@Then("verify {string} reward text with icon is displayed")
	public void verifyGetARewardText(String expecteddata){
		Assert.assertEquals(expecteddata,whybook.verifyRewardText());
	}
	
	@And("click on our price guarantee")
	public void clickOnOurPrice(){
		whybook.clickOnPrice();
	}
	
	@Then("verify {string} price heading is displayed")
	public void verifyPriceGuranteeHeadline(String expecteddata){
		Assert.assertEquals(expecteddata, whybook.verifyPriceGuaranteeHeadline());
	}
	
	@And("click on get a reward night")
	public void clickOnGetReward(){
		whybook.clickOnReward();
	}
	
	@Then("verify {string} reward heading is displayed")
	public void verifyInstant(String expecteddata){
		//Assert.assertEquals(expecteddata, whybook.verifyRewardText());
	}
}
