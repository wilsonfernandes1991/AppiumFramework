package com.flipkart.pageobject;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.flipkart.common.AndroidLib;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AndroidScreen {
	
	AppiumDriver<AndroidElement> driver = null;
	WebDriverWait wait = null;
	TouchAction action = null;
	
	public AndroidScreen(AppiumDriver<AndroidElement> driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Flipkart']")
	public AndroidElement flipkartSmsNotification;
	
	

	public boolean isSmsRecieved() throws InterruptedException
	{				
		for(int i=0;i<20;i++)
		{
			try
			{
				AndroidLib.openPushNotificationTray();
				System.out.println(flipkartSmsNotification.getText());
				System.out.println("PASS : SMS Recieved...");
				Reporter.log("PASS : SMS Recieved...");				
				return true;
			}catch(Exception e)
			{
				AndroidLib.closePushNotificationTray();
				Thread.sleep(2000);
				System.out.println("SMS not recieved, Waiting for 2 Seconds...");
				Reporter.log("SMS not recieved, Waiting for 2 Seconds...");
			}
		}
		return false;
	}	
}
