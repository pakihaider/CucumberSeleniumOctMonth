package com.hotels.automation.framework;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Solvent {
	static Logger logger = LogManager.getLogger(Solvent.class);
    public WebDriver driver;

    public Solvent(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    
    public void elementClick(WebElement element){
    	logger.info("Clicking an element");
    	element.click();
    }
    
    public void elementClickJS(WebElement element){
    	logger.info("Clicking an element through JS");
    	JavascriptExecutor executor = (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", element);
    }
    
    public boolean IsElementDisabled(WebElement element){
    	logger.info("Checking element is disabled");
    	return !element.isEnabled();
    }

    public boolean IsElementEnabled(WebElement element){
    	logger.info("Checking element is enabled");
    	return element.isEnabled();
    }
    
    public void typeAndEnter(WebElement element, String data){
    	logger.info("Typing values and enter in text field");
    	element.sendKeys(data,Keys.ENTER);
    }
    
    public void type(WebElement element, String data){
    	logger.info("Typing values in text field");
    	element.sendKeys(data);
    }
    
    public void typeAndPressTab(WebElement element, String data){
    	logger.info("Typing values in text field");
    	element.sendKeys(data,Keys.TAB);
    }
    
    public void clear(WebElement element){
    	element.clear();
    }
    
    
    public void scrollToPixel(){
    	logger.info("Browser scrolling by 800 pixels");
        JavascriptExecutor executor = ((JavascriptExecutor) driver);
        executor.executeScript("window.scrollBy(0,800)");
    }
    
    public void scrollIntoElement(WebElement element){
    	logger.info("Scroll to element");
    	JavascriptExecutor executor = ((JavascriptExecutor) driver);
        executor.executeScript("arguments[0].scrollIntoView(true);",element);
    }
    
    public void switchToNewTab(){
    	logger.info("Switch to newly tab");
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> windowItr = windows.iterator();
        while (windowItr.hasNext()){
            driver.switchTo().window(windowItr.next());
        }
    }
    
    
    public void selectDropDownByVisibleText(WebElement element, String value) {
    	logger.info("Select option from dropdown");
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
    
    public String getText(WebElement element){
    	logger.info("get text from element");
    	return element.getText();
    }
    
    public void navigateToUrl(String url){
    	logger.info("Navigating to url");
    	driver.navigate().to(url);
    }
    
    public String getAttribute(WebElement element, String value){
    	logger.info("get attribute from element");
    	return element.getAttribute("value");
    }
        
    public void switchBackToDefaultWindow(){
    	logger.info("Switch to default window");
    	driver.switchTo().window(driver.getWindowHandles().iterator().next());
    }
    
    public boolean isElementDisplayed(WebElement element){
    	logger.info("Checking element is displayed");
    	return element.isDisplayed();
    }
    
    public void waitForElementToAppear(WebElement element){
    	logger.info("Waiting for element visibility...");
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.visibilityOf(element));
    }
        
    public void waitForElementToClickable(WebElement element){
    	logger.info("Waiting for element visibility...");
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public String getCssValue(WebElement element, String value){
    	return element.getCssValue(value);
    }
  
}
