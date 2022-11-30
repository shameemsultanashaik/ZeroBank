package com.webappseurity.zero.MavenProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmation {
	
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement conTextBox;
	
	public TransferFundsConfirmation(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	
	public String getconText() {
		
		String ConText= conTextBox.getText();
		return ConText;
		
		
	}
	

}
