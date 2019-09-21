package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/JM/greenFox/selenium/java/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com");

		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.id("password")).sendKeys("1234567790");
		// driver.findElement(By.className("button r4 wide primary")).click(); ERROR
		// can't handle the space between words

		driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.cssSelector("div#error.loginError")).getText();

	}

}
