package com.hotels.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hotels.automation.framework.Solvent;

import io.cucumber.java.en.And;

public class ChangeButton extends Solvent {

	public ChangeButton(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="q-destination")
	public WebElement destination; 

	@FindBy(xpath="//button[@name='Mon Nov 01 2021 12:00:00 GMT-0400 (Eastern Daylight Time)']")
	public WebElement checkInDate;
	
	@FindBy(xpath="//button[@class='_1yFrqc _1ZtnNu']")
	public WebElement checkInButton;
	
	@FindBy(xpath="//button[@name='Fri Nov 05 2021 12:00:00 GMT-0400 (Eastern Daylight Time)']")
	public WebElement checkOutDate;
	
	@FindBy(xpath="//button[text()='Apply']")
	public WebElement apply;
	
	@FindBy(xpath="//button[text()='Search']")
	public WebElement search;
	
	@FindBy(xpath="//button[@class='uolsaJ eLsxCc']")
	public WebElement changeButton;
	
	@FindBy(xpath="//button[@class='_2VNNno _3afsCs _3Q-tqQ _1uldVF']")
	public WebElement selectDestination;
		
	public void enterDestination(String data){

		waitForElementToAppear(destination);
		waitForElementToClickable(destination);
		type(destination, data);
	}
	
	public void clickCheckInDate(){
		elementClick(checkInButton);
		elementClick(checkInDate);
	}
	
	public void clickCheckOutDate(){
		elementClick(checkOutDate);
	}
	
	public void clickOnApply(){
		elementClick(apply);
	}

	public void clickOnSearch(){
		elementClick(search);
	}

	public boolean isChangeButton(){
		loadResult();
		scrollIntoElement(changeButton);
		return IsElementEnabled(changeButton);
	}
	
	public void loadResult(){
        int i=0;

        while(true){
            scrollToPixel();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            if(i==50)
                break;
        }
    }
	
	public void selectDestination(){
		waitForElementToAppear(selectDestination);
		waitForElementToClickable(selectDestination);
		elementClick(selectDestination);
	}

}
