package CucumberFramwork.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	WebDriver driver;

	@Before()
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "/Users/JM/greenFox/selenium/java/geckodriver");
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Given("^user navigate to stacoverflow website$")
	public void user_navigate_to_stacoverflow_website() throws Throwable {
		driver.get("https://stackoverflow.com/");
	}

	@Given("^user click on the login button on homepage$")
	public void usesr_clcik_on_the_login_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	}

	@Given("^user enters a valid usename$")
	public void user_enters_a_valid_usename() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("webdriverUniversity2@mail.com");
	}

	@Given("^user enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Yellow321!");
	}

	@When("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\'submit-button\']")).click();
	}

	@Then("^user should be taken to succefull login page$")
	public void user_should_be_taken_to_succefull_login_page() throws Throwable {
		Thread.sleep(3000);
		WebElement askquostionButton = driver.findElement(By.xpath("//a[contains(text(),'Ask Question')]"));
		Assert.assertEquals(true, askquostionButton.isDisplayed());

	}

}
