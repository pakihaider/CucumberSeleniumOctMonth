package com.hotels.automation.steps;

import com.hotels.automation.framework.TestBase;
import com.hotels.automation.page.ChangeButton;

import org.openqa.selenium.JavascriptExecutor;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ChangeButtonTest extends TestBase {
	
	public ChangeButton changeButton;

    @And("enter {string} in destination")
    public void enterDestination(String destination){
    	changeButton = new ChangeButton(driver);
    	changeButton.enterDestination(destination);
    }
    
    @And("select Bora Bora, Leeward Islands, French Polynesia from auto suggestion")
    public void selectDestination(){
    	changeButton.selectDestination();
    }
    

    @And("select 1 november as checkin")
    public void selectCheckinDate(){
    	changeButton.clickCheckInDate();
    }

    @And("select 5 november as checkout")
    public void selectCheckOutDate(){
    	changeButton.clickCheckOutDate();
    }

    @And("click on apply")
    public void clickApply(){
        changeButton.clickOnApply();
    }

    @And("click on search")
    public void clickSearchButton(){
        changeButton.clickOnSearch();
    }

    @Then("verify change dates is displayed and enabled")
    public void verifyChangeButton(){
        Assert.assertTrue(changeButton.isChangeButton());
    }
}
