package com.hotels.automation.framework;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class TestBase {
	static Logger logger = LogManager.getLogger(TestBase.class);
    public static WebDriver driver;

    public WebDriver tearUp(){
    	logger.info("Calling tear up and returning driver to test cases.....");
        driver = WebDriverFactory.getWebDriver();
        return driver;
    }

    public void tearDown(){
    	logger.info("################Exit browser################");
        driver.quit();
    }

}
