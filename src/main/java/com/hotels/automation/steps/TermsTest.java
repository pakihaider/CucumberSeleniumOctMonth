package com.hotels.automation.steps;

import com.hotels.automation.framework.TestBase;
import com.hotels.automation.page.Terms;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Set;

public class TermsTest extends TestBase {

	public Terms terms;

    @And("navigate to {string}")
    public void clickSignUpLink(String url){
        terms = new Terms(driver);
        terms.navigateToSignUp(url);
    }

    @And("click on terms and conditions")
    public void clickTerms(){
    	terms.clickToTerms();
    }

    @Then("verify terms and conditions opens in new tab")
    public void verifyTerms(){
    	Assert.assertTrue(terms.isTermsInNewTab());
    }

    @And("click privacy statement")
    public void clickPrivacy(){
    	terms.clickToPrivacy();
    }

    @Then("verify privacy statement opens in new tab")
    public void verifyPrivacy(){
    	Assert.assertTrue(terms.isPrivacyInNewTab());
    }
}
