package com.usa.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationClass {

	

	WebDriver driver;
	HomePageFactoryClass pageFct;

	@Given("^User able to open a browser$")
	public void user_able_to_open_a_browser() throws Throwable {
		driver = browserFactoryClass.getBrowser("chrome", driver);

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 200);
		PageFactory.initElements(driver, factory);
		pageFct = PageFactory.initElements(driver, HomePageFactoryClass.class);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Given("^User able to go  AgileTrailblazers  homepage$")
	public void user_able_to_go_AgileTrailblazers_homepage() throws Throwable {

		driver.get(browserFactoryClass.getURL());

	}

	@When("^User able to put valid username$")
	public void user_able_to_put_valid_username() throws Throwable {
		pageFct.getUserName().sendKeys("Atique");
	}

	@When("^User able to put valid email$")
	public void user_able_to_put_valid_email() throws Throwable {
		pageFct.getEmail().sendKeys("Atique123@gmail.com");
	}

	@When("^User able to put valid Mobile phone number$")
	public void user_able_to_put_valid_Mobile_phone_number() throws Throwable {
		pageFct.getPhoneNumber().sendKeys("3232426789");
	}

	@When("^User able to put valid Office phone number$")
	public void user_able_to_put_valid_Office_phone_number() throws Throwable {
		pageFct.getOfficePhoneNumber().sendKeys("6546545678");
	}

	@When("^User able to put email subject$")
	public void user_able_to_put_email_subject() throws Throwable {
		pageFct.getEmailSubject().sendKeys("Contact AgileTrailblazers  management team ");
	}

	@When("^User able to put email Message$")
	public void user_able_to_put_email_Message() throws Throwable {
		pageFct.getEmailMassage()
				.sendKeys("I need help from AgileTrailblazers  management team, please respons with thanks");
	}

	@When("^User able to click Submit button$")
	public void user_able_to_click_Submit_button() throws Throwable {
		pageFct.getSubmitbtn().click();
	}

	@Then("^Validate email deliveed successfully or not$")
	public void validate_email_deliveed_successfully_or_not() throws Throwable {

		String titlestatus = driver.findElement(By.xpath("//*[@id='success-message']")).getText();
		String successfullmsg = "Your message was sent successfully. Thanks.";

		if (titlestatus.equalsIgnoreCase(successfullmsg)) {
			System.out.println(titlestatus + "::Email send successfully");
			System.out.println("<<< Test Passed>>>");
		} else {
			System.out.println("Highlight empty required fields with message: 'Please fill in the required field'");
			System.out.println("<<<<< Test Failed>>>>>>");
			
			driver.quit();
		}}}

