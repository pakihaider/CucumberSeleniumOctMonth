package com.hotels.automation.steps;

import com.hotels.automation.framework.TestBase;
import com.hotels.automation.page.SignIn;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignInTest extends TestBase {
    public SignIn signin;
    
	@And("click on signin")
    public void clickOnSignIn(){
		signin = new SignIn(driver);
        signin.clickToSignIn();
    }

    @And("enter email {string}")
    public void enterEmail(String email){
    	signin.enterEmail(email);
    }

    @And("enter password {string}")
    public void enterPassword(String password){
    	signin.enterPassword(password);
    }

    @And("click on signin button")
    public void signIn(){
        signin.clickToSignInButton();
    }

    @Then("verify error message is displayed")
    public void verifyMessage(){
        Assert.assertTrue(signin.isErrorMessage());
    }
}
