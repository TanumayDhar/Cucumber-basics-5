@Functional
Feature: Login to production (Data table)

In order to perform successful login production
As a user
i want to enter the correct username and password

Scenario Outline: In order to verify the login to facebook production
					Given user navigates to facebook website
					When user validates the homepage title
					Then user entered "<username>" username
					And user entered "<password>" password
					And user select Age category
					
					|Age   | Location |
					|below 18|IND			 |
					|Above 18|USA			 |
					
					Then user "<logintype>" successfully logged in
					
				
Examples:
		
		|username|password|logintype|
		
		|valid   | valid  | shouldbe|
		|Invalid | Invalid| Shouldnot|
		
				
				