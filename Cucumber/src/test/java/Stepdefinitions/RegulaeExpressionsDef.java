package Stepdefinitions;

import cucumber.api.java.en.Given;

public class RegulaeExpressionsDef {

	
	@Given("^I have (\\d+) laptop$")
	public void method1(int num) {
		System.out.println("laptop count "+ num);
	}
	
	@Given("I have (\\d+\\.\\d+) CGPA")
	public void method2(float cgpa) {
		System.out.println("CGPA "+ cgpa);
	}
	
	@Given("\"(.*?)\" is elder than \"(.*?)\" and \"(.*?)\"")
	public void method3(String name1, String name2, String name3) {
		System.out.println(name1 +" is elder than "+ name2 +" and "+ name3 );
	}
	
	
}
