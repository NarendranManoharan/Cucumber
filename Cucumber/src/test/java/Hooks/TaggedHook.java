package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHook {
	
	@Before
	public void BeforeScenario() {
		System.out.println("This is before the scenario");
	}
	
	@Before("@first")
	public void beforeFirst() {
		System.out.println("Before first step");
	}
	
	@Before("@second")
	public void beforeSecond() {
		System.out.println("Before second step");
	}
	
	@Before("@third")
	public void beforeThird() {
		System.out.println("before third step");
	}
	
	@After("@first")
	public void afterFirst() {
		System.out.println("After first step");
	}
	
	@After("@second")
	public void afterSecond() {
		System.out.println("After second step");
}
	
	@After("@third")
	public void afterThird() {
		System.out.println("After third step");
}
	@After
	public void AfterScenario() {
		System.out.println("This is after scenario");
}
}
