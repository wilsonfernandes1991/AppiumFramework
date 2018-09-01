package com.flipkart.home;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.flipkart.common.Config;
import com.flipkart.pageobject.HomeScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

/*
 * Author : Wilson Fernandes
 * Date : 24/07/2018
 */

public class HomeTest {
		
	static AppiumDriver <AndroidElement> driver = null;
	
	static HomeScreen homeScreen = null;	
	static WebDriverWait wait = null;
	
	@BeforeClass()
	public void BeforeClassCondition() throws Exception {
		
		//Setup Appium for your Device
		driver = Config.setupAppium();
		
		homeScreen = new HomeScreen(driver);
	}

	
	@Test
	public void latopSearchTest() throws InterruptedException
	{
		homeScreen.waitForHomeScreen();
		homeScreen.moreOptionIcon.click();
		homeScreen.electronicsTextView.click();
		homeScreen.laptopsTextView.click();
	
		System.out.println("PASS : Navigated to Laptop Search Screen");
		Reporter.log("PASS : Navigated to Laptop Search Screen");
	}
	


	@AfterClass()
	public void CloseDriverInstance()
	{
		driver.quit();
		Config.driver.quit();	
	}

}
