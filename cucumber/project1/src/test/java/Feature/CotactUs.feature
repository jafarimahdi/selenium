Feature:
Submit data in WebDriverUniversit.com using contact us form, user should be able to submit information via the contact 
	us form, if user click on the reset button than all information should be remove from the contact us form.
	
Background: 
	Given access webdriverunivesity page 
	When click the contact us button 
  
Scenario: Submit information to use contact 

	And enter useName 
	And enter the password  
	And enter email adress 
	And enter comments 
	When I click the submit button 
	Then The information should successfully be submited via the contact us form 
	
	
	
Scenario:
Enter information to the contact us form, when click on the reset button then information should be remove 

	Given access webdriverunoversity page 
	When I click on the contact us button 
	And enter userName 
	And enter the password 
	And enter email address 
	And enter comments 
	When I click  on the reset button 
	Then all the information by user were listed, should be remove 
	 
	 
	 // video 25  watched