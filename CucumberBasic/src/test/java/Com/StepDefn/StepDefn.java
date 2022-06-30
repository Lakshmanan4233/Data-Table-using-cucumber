package Com.StepDefn;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefn extends BaseClass{
	
	
	
	@Given("User is on the Adactin hotel login page")
	public void user_is_on_the_adactin_hotel_login_page() {
		
		getDriver(); getUrl("https://adactinhotelapp.com/"); implicitywaits(3);
	   
	}

	@When("User enter the username and password")
	public void user_enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		//1D without header
		
		//List<String> asList = dataTable.asList();
		
		//Table data converted in look like
		
		//{"Lakshmanan","LakshmananSanthanam","Lakshmanana","Lak@4233","MIA6588@","Discover@4233"}
		
		//sendkeys(elementById("username"),asList.get(0));//Lakshmanan 
		//sendkeys(elementById("password"),asList.get(3));//Lak@4233
		
		// 1D with header
		
		//Map<String, String> asMap = dataTable.asMap(String.class,String.class);
		
		//Table data converted in look like
		//Note: The first row change as a header
		
		//{KEY , VALUE} // Key as a header
		//{Lakshmanan : Lak@4233}
		//{LakshmananSanthanam : MIA6588@}
		//{Lakshmanana : Discover@4233}
		
		
		//sendkeys(elementById("username"), asMap.get("Lakshmanan"));//Lak@4233
		//sendkeys(elementById("password"), asMap.get("LakshmananSanthanam"));//MIA6588@
	   
		
		//2D without header
		
		//List<List<String>> asLists = dataTable.asLists();
		
		//Table data converted in look like
		//Note : table change as modulus (0,0 0,1 1,0 1,1)
		
		//As a modulus
		
		//{Lakshmanan , Lak@4233 
		// LakshmananSanthanam , MIA6588@
		// Lakshmanana , Discover@4233 }
		
		
		
		//sendkeys(elementById("username"), asLists.get(0).get(0));//Lakshmanan
		//sendkeys(elementById("password"), asLists.get(0).get(1));//Lak@4233
		
		//2D with header
		
		//List<Map<String, String>> asMaps = dataTable.asMaps();
		
		//Table data converted in look like
		
		//{Lakshmanan  Lak@4233} ==> As a header
		//{LakshmananSanthanam , MIA6588@ 
		// Lakshmanana , Discover@4233 }

		
		//sendkeys(elementById("username"), asMaps.get(1).get("Lak@4233"));// Discover@4233
		//sendkeys(elementById("password"), asMaps.get(1).get("Lakshmanan"));//Lakshmanana
		
		
		
	}

	@Then("user should sucessfully logged in")
	public void user_should_sucessfully_logged_in() {
		
		System.out.println("Data inserted successfull");
		
		
	   
	}

	
}
