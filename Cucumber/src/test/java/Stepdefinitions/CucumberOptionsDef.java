package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CucumberOptionsDef {
	WebDriver driver= new ChromeDriver();
	
	@Given("^User enetr enter google\\.com$")
	public void user_enetr_enter_google_com() throws Throwable {
		driver.get("https://www.google.com/");
	}

	@When("^user clicks search box$")
	public void user_clicks_search_box() throws Throwable {
		Thread.sleep(2000);
	}

	@When("^type search term as \"([^\"]*)\"$")
	public void type_search_term_as(String arg1) throws Throwable {
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		searchbox.sendKeys(arg1 + Keys.ENTER);
		Thread.sleep(3000);
	}

	
 @Then("^then user should see the search result for Gym$") 
  public void  then_user_should_see_the_search_result_for_Gym() throws Throwable {
  driver.quit(); 
  System.out.println("Completed"); }
	 
	}

