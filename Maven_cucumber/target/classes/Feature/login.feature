Feature: Kite Zerodha Login feature

Background:
Given user is on zerodha login page
			
Scenario: valid login action
When user enters username
And user enters password
And user click on login button
Then user navigate to pin page
When user enters pin
And click on continue button
Then user navigate to dashboard page