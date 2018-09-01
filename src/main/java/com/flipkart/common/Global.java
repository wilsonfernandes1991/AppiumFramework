package com.flipkart.common;

import java.io.FileInputStream;
import java.util.Properties;

public class Global {
	
	public static Properties propertyFile = readPropertyFile(System.getProperty("user.dir")+"//src//test//resources//appium.properties");
	
	public static String APPIUM_DRIVER_URL 	= propertyFile.getProperty("APPIUM_DRIVER_URL");
	public static String DEVICE_NAME = propertyFile.getProperty("DEVICE_NAME");
	public static String UDID = propertyFile.getProperty("UDID");
	public static String NO_RESET = propertyFile.getProperty("NO_RESET");
	public static String PLATFORM_VERSION = propertyFile.getProperty("PLATFORM_VERSION");
	public static final String PLATFORM_NAME = "Android";
	public static final String APP_PACKAGE = "com.flipkart.android";
	public static final String APP_ACTIVITY = "com.flipkart.android.SplashActivity";
	// public static final String APP_PACKAGE = "in.redbus.android";
	// public static final String APP_ACTIVITY = "in.redbus.android.root.SplashScreen";

	
	public static String USER_NAME = propertyFile.getProperty("userName");
	public static String PASSWORD = propertyFile.getProperty("password");
	
	
	public static Properties readPropertyFile(String fileName) {

		Properties properties = null;

		FileInputStream inputStream = null;
		try {
			properties = new Properties();
			inputStream = new FileInputStream(fileName);
			properties.load(inputStream);
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (Exception e) {
			}
		}
		return properties;
	}


	

}
