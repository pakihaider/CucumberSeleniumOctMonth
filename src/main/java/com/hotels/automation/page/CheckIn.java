package com.hotels.automation.page;

import com.hotels.automation.framework.Solvent;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckIn extends Solvent {
	 public CheckIn(WebDriver driver) {
	        super(driver);
	 }

	@FindBy(xpath="//button[@class='_1yFrqc _1ZtnNu']")
	public WebElement checkInCalender;
	
	@FindBy(xpath="//button[@aria-label='Previous']")
	public WebElement backButton;
	
	@FindBy(xpath="//button[@class='_yZAx1 _3iv_bt']")
	public List<WebElement> previousDates;
	
	public void clickToCheckInCalender(){
		elementClick(checkInCalender);
	}

	public boolean isBackButtonDisabled(){
		return IsElementDisabled(backButton);
	}
   
	public boolean isPreviousDatesDisabled(){
		boolean result=false;
		
        for(WebElement element:previousDates){
            result = IsElementDisabled(element);
            if(!result)
            	return result;
        }
        
        return result;
	}
}