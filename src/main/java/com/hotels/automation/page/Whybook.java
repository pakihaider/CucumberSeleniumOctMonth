package com.hotels.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hotels.automation.framework.Solvent;

public class Whybook extends Solvent{

	public Whybook(WebDriver driver) {
		super(driver);
	}
	
	
	
	
	@FindBy(xpath="//section[@class='_2Npeyr']")
	public WebElement whybook;
	
	@FindBy(xpath="//li[@class='_2lKfOI _2Y71AG _3LHmkp']//h3")
	public WebElement freecancel1;
	
	@FindBy(xpath="//li[@class='_2lKfOI _2Y71AG _3LHmkp']//span")
	public WebElement freecancel2;
	
	@FindBy(xpath="//li[@class='bPi4hj _2Y71AG _1geHg4']//h3")
	public WebElement price1;
	
	
	@FindBy(xpath="//li[@class='bPi4hj _2Y71AG _1geHg4']//span")
	public WebElement price2;
	
	@FindBy(xpath="//li[@class='_3QWktI _2Y71AG _3SZFs0']//h3")
	public WebElement reward1;
	
	@FindBy(xpath="//li[@class='_3QWktI _2Y71AG _3SZFs0']//span")
	public WebElement reward2;
	
	@FindBy(xpath="//div[@class='pmg-header']//h1")
	public WebElement priceHeadline;
	
	
	
	
	
	public void scrollToWhybookSection(){
		scrollIntoElement(whybook);
	}

	public String verifyFreeCancelText(){
		return getText(freecancel1)+" "+getText(freecancel2);
	}
	
	public String verifyPriceGuaranteeText(){
		return getText(price1)+" "+getText(price2);
	}
	
	public String verifyRewardText(){
		System.out.println(getText(reward1)+" "+getText(reward2));
		return getText(reward1)+" "+getText(reward2);
	}
	
	public String verifyPriceGuaranteeHeadline(){
		return getText(priceHeadline);
	}
	
	
	
	public void clickOnPrice(){
		elementClick(price1);
	}
	

	public void clickOnReward(){
		elementClick(reward1);
	}
	
	
	public void navigateToHotels(String url){
		navigateToUrl(url);
	}
}
