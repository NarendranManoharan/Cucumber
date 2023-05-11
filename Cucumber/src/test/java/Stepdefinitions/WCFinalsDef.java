package Stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WCFinalsDef {
	@Given("^Dhoni comes into bat$")
	public void dhoni_comes_into_bat() throws Throwable {
	   System.out.println("Dhoni comes into bat");
	}

	@When("^scores a valuable knock$")
	public void scores_a_valuable_knock() throws Throwable {
	   System.out.println("scores a valuable knock");
	}

	@When("^hit the final six to complete the chase$")
	public void hit_the_final_six_to_complete_the_chase() throws Throwable {
	    System.out.println("hit the final six to complete the chase");
	}

	@Then("^Indians are happy$")
	public void indians_are_happy() throws Throwable {
	    System.out.println("Indians are happy");
	}

}
