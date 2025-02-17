package CucumberFramwork.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"//Users//JM//greenFox//selenium//cucumber//CucumberFramwork//src//test//java//CucumberFramwork//featureFiles/" }, glue = {
				"CucumberFramwork/steps" }, monochrome = true, tags = {}, plugin = { "pretty", "html:target/cucumber",
						"json:target/cucumber.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" })

public class MainRunner {

}
