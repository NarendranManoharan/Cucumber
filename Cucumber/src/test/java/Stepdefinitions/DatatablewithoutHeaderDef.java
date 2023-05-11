package Stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DatatablewithoutHeaderDef {
	WebDriver driver=new ChromeDriver();
	
	
	@Given("^land to HRIS login page$")
	public void land_to_HRIS_login_page() throws Throwable {
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://172.19.1.3:8080/apex/f?p=125:LOGIN_DESKTOP:");
	}

	@When("^select valid office \"([^\"]*)\"$")
	public void select_valid_office(String offcname) throws Throwable {
		WebElement dropdown=driver.findElement(By.id("P101_COMPANY_CODE"));
		Select dropdownlist=new Select(dropdown);
		dropdownlist.selectByVisibleText(offcname);
	}

	@When("^enetr the valid username$")
	public void enetr_the_valid_username(DataTable dataTable) throws Throwable {
	       
		List<String> credentials= dataTable.asList(String.class);
		String username=credentials.get(0);
		String password=credentials.get(1);
		
		   driver.findElement(By.id("P101_USERNAME")).sendKeys(username);
		   driver.findElement(By.id("P101_PASSWORD")).sendKeys(password);
	}

	@When("^click the submit button$")
	public void click_the_submit_button() throws Throwable {
		driver.findElement(By.id("B13330928382676231")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}


}
