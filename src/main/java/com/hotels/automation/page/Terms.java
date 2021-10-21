package com.hotels.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hotels.automation.framework.Solvent;

public class Terms extends Solvent{

	public static String targetValue;
	
	public Terms(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="sign-up-tc")
	public WebElement terms;
	
	@FindBy(id="sign-up-privacy")
	public WebElement privacy;
	
	@FindBy(xpath="//h1[text()='Terms and Conditions']")
	public WebElement termsHeadline;
	
	@FindBy(xpath="//h1[text()='Privacy Policy']")
	public WebElement privacyHeadline;

	
	public void navigateToSignUp(String url){
		navigateToUrl(url);
	}
	
	public void clickToTerms(){
		elementClick(terms);
		switchToNewTab();
	}
	
	public void clickToPrivacy(){
		elementClick(privacy);
		switchToNewTab();
	}
	
	public boolean isTermsInNewTab(){
		boolean result;
		result = getText(termsHeadline).contains("Terms and Conditions")?true:false;
		if(!result)
			return result;
		
		switchBackToDefaultWindow();
		return result;
	}
	
	public boolean isPrivacyInNewTab(){
		boolean result;
		result = getText(privacyHeadline).contains("Privacy Policy")?true:false;
		if(!result)
			return result;

		switchBackToDefaultWindow();
		return result;
	}
	
}
