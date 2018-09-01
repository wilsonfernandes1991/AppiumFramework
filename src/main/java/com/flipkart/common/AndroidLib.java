package com.flipkart.common;

import org.testng.Reporter;
import io.appium.java_client.TouchAction;

public class AndroidLib {

	static TouchAction action = null; 
	
	public static void openPushNotificationTray()
	{
		action = new TouchAction(Config.driver);
		action.press(495, 27);
		action.moveTo(507, 1537);
		action.release();
		action.perform();
		System.out.println("Notification Tray Opened...");
		Reporter.log("Notification Tray Opened...");
	}
	
	public static void closePushNotificationTray()
	{
		action = new TouchAction(Config.driver);
		action.press(252, 1827);
		action.moveTo(236, 77);
		action.release();
		action.perform();
		System.out.println("Notification Tray Closed...");
		Reporter.log("Notification Tray Closed...");
	}
	
	public static void swipeLeft()
	{
		// Write Code Here
	}
	
	public static void swipeRight()
	{
		// Write Code Here
	}
	
}
