package com.automation.testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;


public class LoginTest extends BaseClass  {
	
	 
	@Test
	public void loginApp() {
		
		try {
		
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.AppLogin("bappa.5678@gmail.com","Bappa_5678");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	
	

}
