Feature: Login For LeafTaps Application 
Background: 
	Given Open the Browser 
	And Max the Browser 
	And Set the Timeout 
	And Navigate to URL 
	
Scenario Outline: TC001 Positive Login Flow 
	And Enter the Username as <username> 
	And Enter the Password as <password> 
	When Click on Login Button 
	Then Verify Login is Successful 
	
	Examples: 
		|username|password|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa| 
		
Scenario: TC003 Negative Login Flow 
	And Enter the Username as DemoCSR1 
	And Enter the Password as crmsfa 
	When Click on Login Button 
	But Verify Login is Failed 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
