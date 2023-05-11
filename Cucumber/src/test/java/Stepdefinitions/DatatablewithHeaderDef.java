package Stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DatatablewithHeaderDef {
		
	WebDriver driver=new ChromeDriver();
	
	@Given("^open HRIS login page$")
	public void open_HRIS_login_page() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			driver.get("http://172.19.1.3:8080/apex/f?p=125:LOGIN_DESKTOP:");
	}

	@When("^enter valid office \"([^\"]*)\"$")
	public void enter_valid_office(String offcname) throws Throwable {
		WebElement dropdown=driver.findElement(By.id("P101_COMPANY_CODE"));
		Select dropdownlist=new Select(dropdown);
		dropdownlist.selectByVisibleText(offcname);
	}

	@When("^provide the valid username and password$")
	public void provide_the_valid_username_and_password(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String,String>> datavalues=dataTable.asMaps(String.class, String.class);
		String username=datavalues.get(0).get("username");
		String password=datavalues.get(0).get("password");
		
		  driver.findElement(By.id("P101_USERNAME")).sendKeys(username);
		   driver.findElement(By.id("P101_PASSWORD")).sendKeys(password);
	}

	@When("^click submit button$")
	public void click_submit_button() throws Throwable {
	   
		driver.findElement(By.id("B13330928382676231")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
