package com.hotels.automation.framework;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    static Logger logger = LogManager.getLogger(WebDriverFactory.class);

    public static WebDriver driver;
    public static String path="";

    public static WebDriver getWebDriver(){
    	path = System.getProperty("user.dir");
    	
    	if(PropertyManager.getProperty("browser").equals("chrome") 
    			&& PropertyManager.getProperty("machine").equals("windows")
    			&& PropertyManager.getProperty("env").equals("production")){
    		
    		logger.info("#########"+PropertyManager.getProperty("env")+" Environment Selected############");
            System.setProperty("webdriver.chrome.driver",path+"/driver/chromedriver.exe");
            driver = new ChromeDriver();
            logger.info("#########Launching Hotels.com##############");
            driver.get(PropertyManager.getProperty("produrl"));
    	}
    	else{
    		driver = new ChromeDriver();
            driver.get(PropertyManager.getProperty("produrl"));
    	}
        
        driver.manage().window().maximize();
        return driver;
    }
}
