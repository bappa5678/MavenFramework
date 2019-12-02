package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	
	
	@FindBy(xpath=".//span[contains(text(), 'Log In')]/..") WebElement logInButton; 
	@FindBy(name="email") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath=".//div[@class='ui fluid large blue submit button']") WebElement SubmitButton;
	
public void AppLogin(String AppUserName, String AppPassword) {
		
		logInButton.click();
		username.sendKeys(AppUserName);
		password.sendKeys(AppPassword);
		SubmitButton.click();
	}
	

}
