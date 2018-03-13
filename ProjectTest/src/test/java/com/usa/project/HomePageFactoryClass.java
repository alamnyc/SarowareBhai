package com.usa.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePageFactoryClass {

	
	protected WebDriver driver;
	private String homePageTitleText = "Home: UPS";
	
	public HomePageFactoryClass(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 200);
		PageFactory.initElements( driver,factory);
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='name']")
	@CacheLookup
	private WebElement UserName;

	@FindBy(how = How.XPATH, using = ".//*[@id='email']")
	@CacheLookup
	private WebElement email;
	@FindBy(how = How.XPATH, using = ".//*[@id='mobile']")
	@CacheLookup
	private WebElement phoneNumber;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='office']")
	@CacheLookup
	private WebElement OfficePhoneNumber;

	@FindBy(how = How.XPATH, using = ".//*[@id='subject']")
	@CacheLookup
	private WebElement emailSubject;
	@FindBy(how = How.XPATH, using = ".//*[@id='message']")
	@CacheLookup
	private WebElement emailMassage;
	@FindBy(how = How.XPATH, using = ".//*[@id='submit']")
	@CacheLookup
	private WebElement submitbtn;
	
	


	public String getHomePageTitleText() {
		return homePageTitleText;
	}


	public WebElement getUserName() {
		return UserName;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPhoneNumber() {
		return phoneNumber;
	}


	public WebElement getOfficePhoneNumber() {
		return OfficePhoneNumber;
	}


	public WebElement getEmailSubject() {
		return emailSubject;
	}


	public WebElement getEmailMassage() {
		return emailMassage;
	}


	public WebElement getSubmitbtn() {
		return submitbtn;
	}


	
	
	
	
	
}
