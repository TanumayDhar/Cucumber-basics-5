package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	//ctrl shit o -> to import all packages all together
	
	//feature are mapped with the steps
	
	
	//can use this \"([^\"]*)\   instead of  \"([a-zA-Z]{1,})\

	// @Before ,after to execute before each n every scenario
	@Before("@Smoke")
	public void setup()
	{
		
		System.out.println("Launch the browser");
	}
	@After("@Smoke")
	public void tearDown()
	{
		
		System.out.println("Quit all browser");
		
	}
	
	@Before("@Functional")
	public void setupForProd()
	{
		
		System.out.println("Launch the browser ForProd");
	}
	@After("@Functional")
	public void tearDownForProd()
	{
		
		System.out.println("Quit all browser ForProd");
		
	}
	
	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
		
		System.out.println("@Given - navigates_to_facebook_website");
	   
	}

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
	   
		System.out.println("@When - validates_the_homepage_title");
	}

	/*@Then("^user entered valid username$")				//commented to test multiple scenario with parameter passing
	public void user_entered_the_username() throws Throwable {
	    
		System.out.println("@Then - user_entered_valid_username");
	}*/
	
	@Then("^user entered \"([a-zA-Z]{1,})\" username$")			//all values a to z and {1, }- > atleast one should be matching 			
	public void user_entered_the_username(String username) throws Throwable {
	    
		System.out.println("@Then - user_entered "+username+"username");
	}

	/*@Then("^user entered valid password$")
	public void user_entered_the_password() throws Throwable {
	    
		System.out.println("@Then - user_entered_valid_password");
	}*/
	
	@Then("^user entered \"([a-zA-Z]{1,})\" password$")  //"\" is required because to seperate the string
	public void user_entered_the_password(String password) throws Throwable {
	    
		System.out.println("@Then - user_entered"+password+"password");
	}
	

	/*@Then("^user shouldbe successfully logged in$")
	public void user_should_be_successfully_logged_in() throws Throwable {
	   
		System.out.println("@Then - user_shouldbe_successfully_logged_in");
	}*/
	
	@Then("^user \"([a-zA-Z]{1,})\" successfully logged in$")  //regular expression ([a-zA-Z]{1,})
	public void user_should_be_successfully_logged_in(String validateLogin) throws Throwable {
	   
		System.out.println("@Then - user "+validateLogin+"successfully_logged_in");
	}

}
