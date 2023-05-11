package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DatatablewithExamplesDef {
	WebDriver driver=new ChromeDriver();
	@Given("^HRIS login page$")
	public void hris_login_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://172.19.1.3:8080/apex/f?p=125:LOGIN_DESKTOP:");
	}

	@When("^enter office \"([^\"]*)\"$")
	public void enter_office(String offcname) throws Throwable {
		WebElement dropdown=driver.findElement(By.id("P101_COMPANY_CODE"));
		Select dropdownlist=new Select(dropdown);
		dropdownlist.selectByVisibleText(offcname);
	}

	@When("^valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void valid_username_and_password(String username, String password) throws Throwable {
		driver.findElement(By.id("P101_USERNAME")).sendKeys(username);
		   driver.findElement(By.id("P101_PASSWORD")).sendKeys(password);
	}

	@When("^click submit button\\.$")
	public void click_submit_button() throws Throwable {
		driver.findElement(By.id("B13330928382676231")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}
	
}
