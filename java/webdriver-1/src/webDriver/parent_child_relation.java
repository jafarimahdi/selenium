package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_child_relation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/JM/greenFox/selenium/java/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		// find target by Parent-Child relationship when attributes is not good choice

		WebElement driver1 = driver.findElement(By.xpath("//div[@class='a4bIc']/input"));
		driver1.sendKeys("hello");
		driver1.sendKeys(Keys.ENTER);

	}

}
