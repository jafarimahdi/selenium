Feature: Login into acount	
	Exsiting user should be able to login to acount using the correct credentials
	
Scenario: Login into account with correct credentials  

	Given user navigate to stacoverflow website2 
	And user click on the login button on homepage2  
	And user enters a valid usename2   
	And user enters a valid password2 
	When user click on the login button2  
	Then user should be taken to succefull login page2 