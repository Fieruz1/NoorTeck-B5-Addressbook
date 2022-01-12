package com.noorteck.qa.steps;

import java.util.List;
import java.util.Map;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class DataTableStepDefinition extends ObjInitialize {
	
@When("User enters data")public void user_enters_data(DataTable dataTable) {
	
	String url = "http://a.testaddressbook.com/sign_up";
	CommonUI.openBrowser("chrome");
	CommonUI.navigate(url);
	initializeClassObj();

		
		//converting dataTable that is coming fromFEATURE FILE to List of Maps
	List<Map<String, String>> listMap = (List<Map<String, String>>) dataTable.asMaps();
	for(Map<String, String> map: listMap) {
		addressObj.enterNewAddress(map.get("NewAddress"));
		addressObj.enterFirstName(map.get("FirstName"));
		addressObj.enterLastName(map.get("LastName"));
		addressObj.enterAddressOne(map.get("AddressOne"));
		addressObj.enterState(map.get("State"));
		addressObj.enterZipCode("Zipcode");
		addressObj.enterPhone(map.get("Phone"));
		addressObj.enterAge(map.get("Age"));
		
		System.out.println("FirstName: " +map.get("NewAddress"));
		System.out.println("FirstName: " +map.get("FirstName"));
		System.out.println("FirstName: " +map.get("LastName"));
		System.out.println("FirstName: " +map.get("AddressOne"));
		System.out.println("FirstName: " +map.get("State"));
		System.out.println("FirstName: " +map.get("Zipcode"));		
		System.out.println("FirstName: " +map.get("Phone"));
		System.out.println("FirstName: " +map.get("Age"));
		
		
		System.out.println("FirstName: " +map.get("********************"));
	}
	
}
}