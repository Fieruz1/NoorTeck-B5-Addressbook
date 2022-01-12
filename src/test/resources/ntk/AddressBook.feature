Feature: Addressbook demo

  Scenario Outline: verify new address create functionality
    Given User is on Addressbook Page
    When User enters newaddress "<NewAddress>"
    And User enters firstname "<FirstName>"
    And User enters lastname "<LastName>"
    And User enters addressone "<AddressOne>"
    And User enters state "<State>"
    And User selects "<Zipcode>"
    And User enters phone "<Phone>"
    And User enters age "<Age>"
    And User clicks createAddress button	
    And User clicks list button
    And User verify title
    Then User waits

    Examples: 
      | NewAddress     | FirstName | LastName |    AddressOne     | State | Zipcode | Phone     | Age  |
      | 77 New Street  | Saba      | C        | 11 Ave            | VA    | USA     |5896414    | 29   |
      | 88 New st      | Taba      | F        | 22 Ave            | MD    | USA     | 545255    | 22   |
      | 22 New Street  | Honey     | S        | 33 Ave            | FL    | USA     |75896414   | 25   |
      | 58 New  Ave    | John      | R        | 22 Ave            | MD    | USA     | 545255    | 27   |
      | 92 New Street  | Honna     | S        | 33 Ave            | FL    | USA     |75896414   | 25   |
      | 48 New Ave     | Johny     | R        | 245 Ave           | MD    | USA     | 545255    | 28   |

 
 