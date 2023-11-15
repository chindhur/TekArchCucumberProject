Feature:Login feature

Background:
			Given User lands on login page
	


Scenario outline:Validate login with correct credentials
		Given User lands on login page
		When User enters valid username and valid password
		When User clicks on login button
		Then User should see home page
//Examples:
//|username    |password|
//|chin@abc.com|K@malesh82|

		
Scenario:Validate login with correct credentials
		When User enters valid username and invalid password
		When User clicks on login button
		Then User should see home page
