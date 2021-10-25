package com.hotels.automation.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PropertyManager {
	static Logger logger = LogManager.getLogger(PropertyManager.class);
	
	public static String getProperty(String key) {
		try {
			String basePath = System.getProperty("user.dir");
			logger.info("Reading automation.properties file...");
			String filePath = basePath + "/src/test/resources/automation.properties";
			
			FileInputStream fis = new FileInputStream(filePath);
			Properties pObj = new Properties();
			pObj.load(fis);
			String value = pObj.getProperty(key);

			return value;
		}
		catch(FileNotFoundException ex) {
			logger.info("File is not found");
		}catch(Exception ex) {
			logger.info("Exception caught");
		}
		return "Exception from function";
	}


}
