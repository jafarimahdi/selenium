Feature: Login into acount	
	Exsiting user should be able to login to acount using the correct credentials
	
Scenario: Login into account with correct credentials  

	Given user navigate to stacoverflow website 
	And user click on the login button on homepage 
	And user enters a valid usename  
	And user enters a valid password
	When user click on the login button 
	Then user should be taken to succefull login page
	       