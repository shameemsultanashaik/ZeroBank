package com.webappseurity.zero.MavenProject1;




import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class verifyVaildLoginTest extends Base {
	
	
	@Test 
	public void VerifyVaildLogin() {
		Login lp = new Login(driver);
		
		AccountSummary acc = new AccountSummary(driver);
		lp.applicationLogin("username", "password");
		boolean transferFundsPresent = acc.isTransferFundsPresent();
		Assert.assertTrue(transferFundsPresent);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



