package com.hotels.automation.page;

import com.hotels.automation.framework.Solvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guest extends Solvent {
    public Guest(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath="//button[@class='_1yFrqc']")
    public WebElement guest;
    
    @FindBy(xpath="//select[@name='q-room-0-adults']")
    public WebElement adult;
    
    @FindBy(xpath="//select[@name='q-room-0-children']")
    public WebElement child;

    @FindBy(xpath="//select[@name='q-room-0-child-0-age']")
    public WebElement childAgeForFirst;

    @FindBy(xpath="//select[@name='q-room-0-child-1-age']")
    public WebElement childAgeForSecond;

    @FindBy(xpath="//div[@class='_1sygyM']")
    public WebElement numberOfAdultChild;
    
    @FindBy(xpath="//button[text()='Apply']")
    public WebElement apply;
    
    @FindBy(xpath="(//button[@class='_1yFrqc']//span)[4]")
    public WebElement totalGuest;
    
    
    
    public void clickToGuest(){
    	elementClick(guest);
    }
    
    public void selectNumberOfAdult(String value){
    	elementClick(adult);
    	selectDropDownByVisibleText(adult, value);
    }
    
    public void selectNumberOfChild(String value){
    	elementClick(child);
    	selectDropDownByVisibleText(child, value);
    }
    
    public void selectAgeForFirstChild(String value){
    	elementClick(childAgeForFirst);
    	selectDropDownByVisibleText(childAgeForFirst, value);
    }
    
    public void selectAgeForSecondChild(String value){
    	elementClick(childAgeForSecond);
    	selectDropDownByVisibleText(childAgeForSecond, value);
    }
    
    public boolean isNumberOfAdultChild(){
    	return getText(numberOfAdultChild).contains("4 Adults, 2 Children")?true:false;
    }
    
    public void clickToApply(){
    	elementClick(apply);
    }
    
    public boolean isTotalGuests(String value){
    	return getText(totalGuest).contains(value+" guests")?true:false;
    }
}
