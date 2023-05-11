package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinitions {
	 
	WebDriver driver= new ChromeDriver();
	
	@Given("^User need to enter google\\.com$")
	public void user_need_to_enter_google_com() throws Throwable {
	 driver.get("https://www.google.com/");
	}

	@When("^user clicks the search box$")
	public void user_clicks_the_search_box() throws Throwable {
		Thread.sleep(2000);
	}

	@When("^types the search term as \"([^\"]*)\"$")
	public void types_the_search_term_as(String arg1) throws Throwable {
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		searchbox.sendKeys(arg1 + Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("^the user should see the search results for Gym$")
	public void the_user_should_see_the_search_results_for_Naren() throws Throwable {
	Boolean link= driver.findElement(By.partialLinkText("Billionaires")).isDisplayed();
	if(link) {
        System.out.println("link present");
	}else {
		 System.out.println("link not present");
	}
	}
}
