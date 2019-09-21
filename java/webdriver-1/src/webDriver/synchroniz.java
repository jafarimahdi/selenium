package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchroniz {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/JM/greenFox/selenium/java/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("alaska.com");

		driver.findElement(By.id("H-destiontion")).sendKeys("nyc");
		driver.findElement(By.id("H-destiontion")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-destiontion")).sendKeys(Keys.ENTER);
	}

}
