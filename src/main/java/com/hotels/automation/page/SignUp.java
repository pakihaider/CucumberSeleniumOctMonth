package com.hotels.automation.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hotels.automation.framework.Solvent;

public class SignUp extends Solvent {

	public SignUp(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@class='_3gE-EQ _3aQl-1']")
	public WebElement signIn;
	
	@FindBy(id="hdr-create")
	public WebElement signup;
	
	@FindBy(id="sign-up-email")
	public WebElement email;
	
	@FindBy(xpath="//small[@id='email-error']")
	public WebElement emailerror;
	
	@FindBy(xpath="//small[@id='password-error']")
	public WebElement passworderror;
	
	@FindBy(id="sign-up-password")
	public WebElement password;
	
	@FindBy(id="sign-up-first-name")
	public WebElement firstname;
	
	@FindBy(id="firstName-error")
	public WebElement firstnameError;
	
	@FindBy(id="sign-up-last-name")
	public WebElement lastname;
	
	@FindBy(id="lastName-error")
	public WebElement lastnameError;

	@FindBy(xpath="//div[@class='sica-form-cont']//div[@class='form-element valid']")
	public WebElement emailTick;
	
	@FindBy(xpath="(//div[@class='sica-form-cont']//div[@class='form-element valid'])[2]")
	public WebElement passwordTick;

	@FindBy(xpath="(//div[@class='sica-form-cont']//div[@class='form-element valid'])[3]")
	public WebElement firstnameTick;

	@FindBy(xpath="(//div[@class='sica-form-cont']//div[@class='form-element valid'])[4]")
	public WebElement lastnameTick;


	public void clickToSignIn(){
		elementClick(signIn);
	}
	
	public void clickToSignUp(){
		elementClick(signup);
	}
	
	public void enterEmail(String data){
		typeAndPressTab(email, data);
	}

	public void enterPassword(String data){
		clear(password);
		typeAndPressTab(password, data);
	}
	
	public String isEmailErrorMessage(){
		waitForElementToAppear(emailerror);
		return getText(emailerror);
	}

	public String isPasswordErrorMessage(){
		waitForElementToAppear(passworderror);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getText(passworderror);
	}

	public void enterFirstName(String data){
		typeAndPressTab(firstname, data);
	}

	public void enterLastName(String data){
		typeAndPressTab(lastname, data);
	}
	
	public String getFirstNameMessage(){
		waitForElementToAppear(firstnameError);
		return getText(firstnameError);
	}
	
	public String getLastNameMessage(){
		waitForElementToAppear(lastnameError);
		return getText(lastnameError);
	}
	
	public boolean isTickMarkForEmail(){
		waitForElementToAppear(emailTick);
		return isElementDisplayed(emailTick);
	}
	
	public boolean isTickMarkForPassword(){
		waitForElementToAppear(passwordTick);
		return isElementDisplayed(passwordTick);
	}
	
	public boolean isTickMarkForFirstname(){
		waitForElementToAppear(firstnameTick);
		return isElementDisplayed(firstnameTick);
	}
	
	public boolean isTickMarkForLastname(){
		waitForElementToAppear(lastnameTick);
		return isElementDisplayed(lastnameTick);
	}
}

