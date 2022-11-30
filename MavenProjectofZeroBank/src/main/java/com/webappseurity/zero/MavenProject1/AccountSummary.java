package com.webappseurity.zero.MavenProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountSummary {
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(2) > div > table > thead > tr > th:nth-child(1)")
	private WebElement Account;
	
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(2) > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > a")
	private WebElement SavingsElem1;
	
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(2) > div > table > tbody > tr:nth-child(2) > td:nth-child(1) > a")
	private WebElement SavingsElem2;
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(4) > div > table > tbody > tr > td:nth-child(1) > a")
	private WebElement BrokerageElem;
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(6) > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > a")
	private WebElement CheckingElem;
	
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(6) > div > table > tbody > tr:nth-child(2) > td:nth-child(1) > a")
	private WebElement CreditCardElem;
	
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(8) > div > table > tbody > tr > td:nth-child(1) > a")
	private WebElement LoanElem;
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(6) > div > table > thead > tr > th:nth-child(2)")
	private WebElement CreditCardElem2;
		
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(6) > div > table > tbody > tr:nth-child(1) > td:nth-child(2)")
	private WebElement VISA1;
	
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(6) > div > table > tbody > tr:nth-child(2) > td:nth-child(2)")
	private WebElement VISA2;
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(2) > div > table > tbody > tr:nth-child(1) > td:nth-child(3)")
	private WebElement AmountElem1;
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(2) > div > table > tbody > tr:nth-child(2) > td:nth-child(3)")
	private WebElement AmountElem2;
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(4) > div > table > tbody > tr > td:nth-child(3)")
	private WebElement AmountElem3;
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(6) > div > table > tbody > tr:nth-child(1) > td:nth-child(3)")
	private WebElement AmountElem4;
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(6) > div > table > tbody > tr:nth-child(2) > td:nth-child(3)")
	private WebElement AmountElem5;
	
	@FindBy(css="body > div.wrapper > div.container > div > div:nth-child(2) > div > div > div:nth-child(8) > div > table > tbody > tr > td:nth-child(3)")
	private WebElement AmountElem;
	
	@FindBy(linkText="Transfer Funds")
	
	private WebElement transFunds;
	
	public AccountSummary(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickTransFunds() {
		transFunds.click();
		
	}
	
	public boolean isTransferFundsPresent() {
		boolean TransferFundsPresent = transFunds.isDisplayed();
		return TransferFundsPresent;
		
		
	}
	
public String getAccountText() {
		
		String AcctText= Account.getText();
		return AcctText;
		
		
	}
		
	
	
		
	
	
	
		
		 
		
		
	
	

}
