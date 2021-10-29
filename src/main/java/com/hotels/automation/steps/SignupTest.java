package com.hotels.automation.steps;

import org.testng.Assert;

import com.hotels.automation.framework.TestBase;
import com.hotels.automation.page.SignUp;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SignupTest extends TestBase {
	public SignUp signup;
	
	@And("click on signin link")
	public void clickToSignIn(){
		signup = new SignUp(driver);
		signup.clickToSignIn();
	}
	
	@And("click on signup link")
	public void clickToSignUp(){
		signup.clickToSignUp();
	}
	
	@And("enter email {string} for validation")
	public void enterEmail(String data){
		signup.enterEmail(data);
		
	}
	
	@Then("verify email error message {string} is displayed")
	public void emailError(String message){
		Assert.assertEquals(message, signup.isEmailErrorMessage());
	}
	
	@And("enter password {string} characters")
	public void enterPassword(String data){
		signup.enterPassword(data);
	}
	
	@Then("verify password error message {string} is displayed")
	public void passwordError(String message){
		Assert.assertEquals(message, signup.isPasswordErrorMessage());
	}
	
	@And("enter first name {string}")
	public void enterFirstName(String firstname){
		signup.enterFirstName(firstname);
	}
	
	@Then("verify firstname error message {string} is displayed")
	public void verifyFirstNameMessage(String firstnameMessage){
		Assert.assertEquals(firstnameMessage, signup.getFirstNameMessage());
	}
	
	@And("enter last name {string}")
	public void enterLastName(String lastname){
		signup.enterLastName(lastname);
	}
	
	@Then("verify lastname error message {string} is displayed")
	public void verifyLastNameMessage(String lastNameMessage){
		Assert.assertEquals(lastNameMessage, signup.getLastNameMessage());
	}
	
	@Then("verify tick mark is displayed for email")
	public void verifyTickMarkForEmail(){
		Assert.assertTrue(signup.isTickMarkForEmail());
	}
	
	@Then("verify tick mark is displayed for password")
	public void verifyTickMarkForPassword(){
		Assert.assertTrue(signup.isTickMarkForPassword());
	}
	
	@Then("verify tick mark is displayed for firstname")
	public void verifyTickMarkForFirstname(){
		Assert.assertTrue(signup.isTickMarkForFirstname());
	}
	
	@Then("verify tick mark is displayed for lastname")
	public void verifyTickMarkForLastname(){
		Assert.assertTrue(signup.isTickMarkForLastname());
	}
	
	
}
