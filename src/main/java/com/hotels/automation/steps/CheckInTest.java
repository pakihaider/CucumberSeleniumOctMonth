package com.hotels.automation.steps;

import com.hotels.automation.framework.TestBase;
import com.hotels.automation.page.CheckIn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckInTest extends TestBase {
    public CheckIn checkin;

    @And("click on checkin calender")
    public void checkInCalender(){
        checkin = new CheckIn(driver);
        checkin.clickToCheckInCalender();
    }

    @Then("verify back button is disabled")
    public void verifyBackButton(){
        Assert.assertTrue(checkin.isBackButtonDisabled());
    }

    @And("verify previous dates are disabled")
    public void verifyPreviousDates(){
    	Assert.assertTrue(checkin.isPreviousDatesDisabled());
    }
}
