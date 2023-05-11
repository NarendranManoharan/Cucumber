package runner;

import java.time.Duration;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefile" ,
glue={"Stepdefinitions","Hooks"},
dryRun=false, monochrome=true ,
plugin= {"html:report/WebReport", "json:report/jsonreport.json",  "junit:report/cucumber.xml"},
tags= {"@Background"}
)
public class RunnerClass {
	 
       
}
