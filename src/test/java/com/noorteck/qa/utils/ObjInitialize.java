package com.noorteck.qa.utils;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;

/**
 * 
 * @author Fieruz
 * * The purpose this class is to initialize the PAGECLASS objects
 * 
 */

public class ObjInitialize extends Constants {	

	//initialize each page class objects here..

	public static void initializeClassObj() {

		addressObj = new AddressesPage();
		homeObj = new HomePage();
		signUpObj = new SignUpPage();
		signInObj = new SignInPage();

	}		
}

