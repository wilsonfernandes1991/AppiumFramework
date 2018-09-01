package com.flipkart.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen {
	
	AppiumDriver<AndroidElement> driver = null;
	WebDriverWait wait = null;
	
	
	public HomeScreen(AppiumDriver<AndroidElement> driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Open Drawer']")
	public AndroidElement moreOptionIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Electronics']")
	public AndroidElement electronicsTextView;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Laptops']")
	public AndroidElement laptopsTextView;

	public void waitForHomeScreen()
	{
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.flipkart.android:id/search_widget_textbox")));
		System.out.println("Search Text Box found...");
		Reporter.log("Search Text Box found...");
	}
	
	public void enterTransactionAmount(String amount)
	{
		wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt_amount")));
		//amountTextBox.sendKeys(amount);
		System.out.println("Transaction amount '"+amount+"' entered...");
		Reporter.log("Transaction amount '"+amount+"' entered...");
	}
	
	public void clickOnMenuOptionsIcon()
	{
		wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
		//menuIcon.click();
		System.out.println("Clicked On Menu Options Icon...");
		Reporter.log("Clicked On Menu Options Icon...");
	}
	
}
