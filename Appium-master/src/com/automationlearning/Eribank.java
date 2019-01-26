package com.automationlearning;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Eribank {

	
	AppiumDriver<MobileElement> driver;
	String path;
	public void setup()
	{
		System.out.println("Session is creating");
		path = System.getProperty("user.dir");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Nexus 5");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("app", path+"//app//EriBank_1.0.apk");
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Session is created");
	}
	public void validateText() throws InterruptedException
	
	{
		
		//driver.findElementById("android:id/button1").click();
		//Thread.sleep(5000);
          //driver.findElementByAccessibilityId("OK").click();
		//Thread.sleep(5000);
		driver.findElementById("com.experitest.ExperiBank:id/usernameTextField").click();
		driver.findElementById("com.experitest.ExperiBank:id/usernameTextField").sendKeys("company");
		driver.findElementById("com.experitest.ExperiBank:id/passwordTextField").click();
		driver.findElementById("com.experitest.ExperiBank:id/passwordTextField").sendKeys("company");
		driver.findElementById("com.experitest.ExperiBank:id/loginButton").click();
		Thread.sleep(5000);
		String text = driver.findElementById("com.experitest.ExperiBank:id/makePaymentButton").getText();
		if(text.equalsIgnoreCase("Make Payment"))
		{
			System.out.println("Passed");
		} else
		{
			System.out.println("Failed");
		}
		
	}
	public void tearDown()
	{
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
	
		
		Eribank obj = new Eribank();
		obj.setup();
		obj.validateText();
		obj.tearDown();

	}

}
