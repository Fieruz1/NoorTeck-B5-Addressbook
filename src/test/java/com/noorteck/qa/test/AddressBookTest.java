package com.noorteck.qa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://a.testaddressbook.com/sign_up";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		TestCasetOne();		
		CommonUI.quitBrowser();

		url ="http://a.testaddressbook.com/sign_in";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();

		TestCaseTwo();
		Thread.sleep(3000);
		CommonUI.quitBrowser();
	}

	public static void TestCasetOne() throws InterruptedException {
		String expected_Title = "Welcome to Address Book";

		signUpObj.enterSignUpEmail("Jhnchia3@gmail.com");
		signUpObj.enterPasswordSignUp("Hppyne2025");		
		signUpObj.clickSubmit();
		String ActualMessage = signUpObj.displayedTitle();
		Thread.sleep(3000);
		if(ActualMessage.contains(expected_Title)) {
			System.out.println("verified");
		}else {
			System.out.println("Not Message verified");
		}		
	}
	public static void TestCaseTwo() {


		signInObj.enterSignInEmail("Jhnchia3@gmail.com");
		signInObj.enterPasswordSignIn("Hppyne2025");
		signInObj.clickSubmit();
		homeObj.clickAddress();//Click Addresses from menu
		addressObj.clickNewAdr();//Click New Address
		addressObj.enterFirstName("John");
		addressObj.enterLastName("hina");
		addressObj.enterAddressOne("818 street");
		addressObj.enterCity("Alexandria");
		addressObj.selectState("Text", "VA");
		addressObj.selectCountry();
		addressObj.enterAge("22");
		addressObj.enterPhone("123-2334-3434");
		addressObj.clickInterst();
		addressObj.enterNote("Automation is Fun");
		addressObj.clickButton();
		addressObj.clicklist();//Click List button

		//	Verify Addresses table displays first name you entered in step 8
		SoftAssert softAssert = new SoftAssert();
		String ActualName = "Cina";
		String ExpectedName = addressObj.DisplayedFirstname();

		softAssert.assertEquals(ActualName, ExpectedName);
		if(addressObj.DisplayedFirstname().equals(ExpectedName)) {
			System.out.println("Verified");
		}else {
			System.out.println("Not verified");
		}	
		//Verify Addresses table displays last name you entered in step 9
		String Expected_lastName = addressObj.DisplayedLastname();
		String Actual_lastName = "Cina";
		softAssert.assertEquals(Actual_lastName, Expected_lastName);
		if((Actual_lastName).equalsIgnoreCase(Expected_lastName))
		{
			System.out.println("Verified");
		}else {
			System.out.println("Not verified");
		}
		// Verify Addresses table displays city name you entered in step 11
		String Expected_city = addressObj.cityDisplayedCity();
		String Actual_city = "Alexandria";

		if((Actual_city).equalsIgnoreCase(Expected_city)){
			System.out.println("Verified");
		}else {
			System.out.println("Not verified");
		}	
		// Verify Addresses table displays state name you entered in step 12
		String Expected_state = addressObj.stateDisplayedState();
		String Actual_state = "VA";
		if((Actual_state).equalsIgnoreCase(Expected_state)){
			System.out.println("verfified");
		}else {
			System.out.println("Not verified");
		}
	}
}