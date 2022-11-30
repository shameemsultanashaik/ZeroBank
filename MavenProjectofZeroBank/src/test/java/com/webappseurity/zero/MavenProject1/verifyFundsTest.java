package com.webappseurity.zero.MavenProject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class verifyFundsTest extends Base {
	
	
	
	@Test
	public void verifyFundsTransfer() {
		Login lp = new Login(driver);
		AccountSummary acc = new AccountSummary(driver);
		Transfunds tf = new Transfunds(driver);
		TransferFundsVerify tfv = new TransferFundsVerify(driver);
		TransferFundsConfirmation tfc = new TransferFundsConfirmation(driver);
		
		lp.applicationLogin("username", "password");
		acc.clickTransFunds();
		tf.doFundTranfer("200","Fund Transfer of $200");
		
		tfv.clickSubmit();
		String actualMsg = tfc.getconText();
		String expectedMsg = "You successfully submitted your transaction.";
		
		Assert.assertEquals(actualMsg, expectedMsg);
		
		
	}
	
	

}


