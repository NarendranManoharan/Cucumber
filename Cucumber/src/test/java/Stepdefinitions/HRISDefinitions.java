package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HRISDefinitions {

	WebDriver driver=new ChromeDriver();
   
	
	@Given("^navigate to HRIS login page$")
	public void navigate_to_HRIS_login_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("http://172.19.1.3:8080/apex/f?p=125:LOGIN_DESKTOP:");
	}
	@When("select the valid office \"(.*?)\"")
	public void Select_the_valid_office_cd(String offcname) {
		WebElement dropdown=driver.findElement(By.id("P101_COMPANY_CODE"));
		Select dropdownlist=new Select(dropdown);
		dropdownlist.selectByVisibleText(offcname);
	}

	@When("^enetring the valid username-\"([^\"]*)\" and password-\"([^\"]*)\"$")
	public void enetring_the_valid_username_and_password(String username, String password) throws Throwable {
	
	   driver.findElement(By.id("P101_USERNAME")).sendKeys(username);
	   driver.findElement(By.id("P101_PASSWORD")).sendKeys(password);
	}

	@When("^click on the submit button$")
	public void click_on_the_submit_button() throws Throwable {
	driver.findElement(By.id("B13330928382676231")).click();
	}

	@Then("^succesfully logoin to HRIS webportal$")
	public void succesfully_logoin_to_HRIS_webportal() throws Throwable {
	   WebElement profile=driver.findElement(By.xpath("//span[@class=\"t-Icon txtblue fa-user\"]//following::span"));
	   String profilename=profile.getText();
	   if(profilename.contains("Narendran")) {
		   System.out.println(profilename);
		   driver.findElement(By.xpath("//span[@class=\"t-Icon fa-sign-out txtgreen fa-sign-out\"]//following::span")).click();
	   }
	   else {
		   
		   driver.findElement(By.xpath("//span[@class=\"t-Icon fa-sign-out txtgreen fa-sign-out\"]//following::span")).click();
	   }
	}

}
