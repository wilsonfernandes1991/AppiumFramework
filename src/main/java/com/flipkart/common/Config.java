package com.flipkart.common;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Config {
	
	public static AppiumDriver<AndroidElement> driver = null;	
	public static WebDriver seleniumDriver;
	
	public static AppiumDriver<AndroidElement> setupAppium() throws MalformedURLException  {
		
		System.out.println("Starting Appium Driver.......");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", Global.DEVICE_NAME);
		caps.setCapability("udid", Global.UDID); //Give Device ID of your mobile phone
		caps.setCapability("platformName", Global.PLATFORM_NAME);
		caps.setCapability("platformVersion", Global.PLATFORM_VERSION);
		caps.setCapability("appPackage", Global.APP_PACKAGE); 
		caps.setCapability("appActivity", Global.APP_ACTIVITY);
		caps.setCapability("noReset", Global.NO_RESET);
		driver = new AndroidDriver<AndroidElement>(new URL(Global.APPIUM_DRIVER_URL), caps);
		
		System.out.println("Appium Server is up and running...");
		return driver;
	}	
}
