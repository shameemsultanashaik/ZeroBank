package com.webappseurity.zero.MavenProject1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class VerifyInvalidLoginTest extends Base {
	
	
	
	@Test
	public void VerifyInvaildLogin() {
		Login lp = new Login(driver);
		
		lp.applicationLogin("user1111", "pass1111");
		String actualText = lp.getErrorMsgText();
		String expectedText = "Login and/or password are wrong.";
		
		Assert.assertEquals(actualText,expectedText);
				
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
