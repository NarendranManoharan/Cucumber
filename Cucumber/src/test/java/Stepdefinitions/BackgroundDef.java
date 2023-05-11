package Stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BackgroundDef {
	
	@Given("^Completed the high school$")
	public void completed_the_high_school() throws Throwable {
	   System.out.println("completed_the_high_school");
	}

	@Given("^Completed the higher sec school$")
	public void completed_the_higher_sec_school() throws Throwable {
	   System.out.println("Completed the higher sec school"
	   		+ "");
	}

	@Given("^Student applied for the medical course$")
	public void student_applied_for_the_medical_course() throws Throwable {
	    System.out.println("Student applied for the medical course");
	}

	@When("^clear the entrance exam$")
	public void clear_the_entrance_exam() throws Throwable {
	    System.out.println("clear the entrance exam");
	}

	@When("^Joinig the medical institute$")
	public void joinig_the_medical_institute() throws Throwable {
	    System.out.println("Joinig the medical institute");
	}

	@Given("^Student applied for the engineering course$")
	public void student_applied_for_the_engineering_course() throws Throwable {
	    System.out.println("Student applied for the engineering course");
	}

	@When("^Attended the counselling$")
	public void attended_the_counselling() throws Throwable {
	  System.out.println("Attended the counselling");
	}

	@When("^Joining the engineering college$")
	public void joining_the_engineering_college() throws Throwable {
	   System.out.println("Joining the engineering college");
	}
}
