package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.noorteck.qa.utils.CommonUI;
/**
 * 
 * @author Fieruz
 * Home page 
 */

public class HomePage extends CommonUI{

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement HomeButton;

	@FindBy(xpath = "//a[@data-test='addresses']")
	WebElement addressBtn;

	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	WebElement SignOutButton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickHome() {
		click(HomeButton);
	}  
	public void clickAddress() {
		click(addressBtn);
	}    
	public void clickEnter() {
		click(SignOutButton);
	}
}
