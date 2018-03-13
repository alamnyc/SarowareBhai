Feature: Validation email delivery function 

	Description: As a user of the Mock AgileTrailblazers website I would 
			like to contact AgileTrailblazers so that an email will be delivered 
			to the AgileTrailblazers management team.

Scenario: To check email delivery system 
	Given User able to open a browser 
	And User able to go  AgileTrailblazers  homepage 
	When User able to put valid username 
	And User able to put valid email 
	And User able to put valid Mobile phone number 
	And User able to put valid Office phone number 
	And User able to put email subject 
	And User able to put email Message 
	And User able to click Submit button 
	Then Validate email deliveed successfully or not