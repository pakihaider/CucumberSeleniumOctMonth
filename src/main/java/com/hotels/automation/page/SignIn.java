package com.hotels.automation.page;

import com.hotels.automation.framework.Solvent;

import io.cucumber.java.en.And;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends Solvent {
    public SignIn(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath="//a[@class='_3gE-EQ _3aQl-1']")
    public WebElement signIn;
    
    @FindBy(id="sign-in-email")
    public WebElement email;
    
    @FindBy(id="sign-in-password")
    public WebElement password;
    
    @FindBy(id="sign-in-button")
    public WebElement signInButton;
    
    @FindBy(xpath="//div[@class='msg-error-icon msg-big mb-spider']")
    public WebElement message;
  
    
    public void clickToSignIn(){
    	elementClick(signIn);
    }
    
    public void enterEmail(String data){
    	type(email, data);
    }

    public void enterPassword(String data){
    	type(password,data);
    }

    public void clickToSignInButton(){
    	elementClick(signInButton);
    }
    
    public boolean isErrorMessage(){
    	waitForElementToAppear(message);
    	return isElementDisplayed(message);
    }
}
