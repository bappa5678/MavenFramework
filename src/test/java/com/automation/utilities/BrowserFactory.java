package com.automation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String appaUrl){

	if(browserName.equals("Chrome")){
		System.out.println("This is before webdriver");
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				projectPath+ "\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	
		
	}
	
	else if(browserName.equals("Firefox")){
		System.out.println("This is before webdriver");
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				projectPath+ "\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	
	else {
		
		
		System.out.println("This browser not supported");
	}
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(appaUrl);
	return driver;
	
	}

	public static void quitBrowser(WebDriver driver){

		
		driver.quit();
	}

}
