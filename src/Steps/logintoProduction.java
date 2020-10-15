package Steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class logintoProduction {
	
	
	
	@Then("^user validates homepagheIcon$")
	public void user_validates_homepagheIcon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	/*@And("^user select Age category$")    //one process if only Age
	public void user_select_Age_category(List<String> list) throws Throwable {
	    
		
		System.out.println("@And --user select age and location:  "+list.get(0));
	  
	}*/

	@And("^user select Age category$")     //second process if age and location present in table
	public void user_select_Age_category(DataTable table) throws Throwable {
	    
		
		List<Map<String, String>> data= table.asMaps(String.class, String.class); 
		System.out.println("@And --user select age and location:  " +data.get(0).get("Age")+"---selected location "+data.get(0).get("Location"));
	  
	}
}
