package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI{

	@FindBy(id = "user_email")
	WebElement EmailField;

	@FindBy(id ="user_password")
	WebElement passwordField;

	@FindBy(xpath= "//input[@class='btn btn-primary']")
	WebElement submitButton;

	@FindBy(xpath= "//h1[text()='Welcome to Address Book']")
	WebElement messageField;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterSignUpEmail(String email) {
		enter(EmailField, email);
	}
	public void enterPasswordSignUp(String password) {
		enter(passwordField, password);
	}
	public void clickSubmit() {
		click(submitButton);
	}
	public String displayedTitle() {
		return getText(messageField);
	}
}
