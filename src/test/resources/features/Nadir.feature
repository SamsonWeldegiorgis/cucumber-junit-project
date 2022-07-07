@smoker
Feature: Default

	#This test is designed to validate access for truck driver
	@B26GR3-9

	Scenario: Login as a user
		1.Given as a user/ track driver on vytrack Home page as a Truck driver
		   When user hover the Fleet module 
		   And user Scroll down to Fleet functionalities 
		   And user click Vehicle 
		   Then user should be able to see all Vehicle details