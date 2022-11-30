package com.webappseurity.zero.MavenProject1;


import org.junit.Assert;
import org.testng.annotations.Test;


public class VerifyAccountSummary extends Base{
	
	@Test
	public void VerifyAccountSummary() {
		


		Login lp = new Login(driver);
		AccountSummary acc = new AccountSummary(driver);
	
		
		lp.applicationLogin("username", "password");
		
		String actualMsg = acc.getAccountText();
		String expectedMsg = "Account";
		
		Assert.assertEquals(actualMsg,expectedMsg);
		
		
	}	

}
