package com.hotels.automation.page;

import com.hotels.automation.framework.Solvent;

import com.hotels.automation.framework.TestBase;
import io.cucumber.java.en.And;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends Solvent {
    static Logger logger = LogManager.getLogger(TestBase.class);
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
        logger.info("Clicking to sign");
        elementClick(signIn);
    }
    
    public void enterEmail(String data) {
        logger.info("Entering email");
    	type(email, data);
    }

    public void enterPassword(String data){
    	logger.info("Entering password");
        type(password,data);
    }

    public void clickToSignInButton(){
        logger.info("Clicking to signin");
    	elementClick(signInButton);
    }
    
    public boolean isErrorMessage(){
    	waitForElementToAppear(message);
    	return isElementDisplayed(message);
    }
}
