#Author: aravind.mtech@gmail.com

Feature: Verify JP Morgon logo 

	Background:
		Given User has opened Browser 
		And User has all pageobjects
		
  Scenario: Verify the JP Morgan logo is shown
  	Given user verify the google page
  	And enter "JP Morgan" in the search box
  	And click on search button
  	When user click on the first link
  	Then user verify the logo of "JP Morgan" is displayed
  	And close the browser