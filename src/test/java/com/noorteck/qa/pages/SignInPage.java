package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI{

    	
	@FindBy(id= "session_email")
	WebElement signInEmailField;

	
	@FindBy(id = "session_password")
	WebElement passwordSignInField;

	@FindBy(css= ".btn.btn-primary")
	WebElement signInButton;

	public void SignIn() {
		PageFactory.initElements(driver, passwordSignInField);
	}
	public void enterSignInEmail(String email) {
		enter(signInEmailField, email);
	}
	public void enterPasswordSignIn(String password) {
		enter(passwordSignInField, password);
	}
	public void clickSubmit() {
		click(signInButton);
	}
}
