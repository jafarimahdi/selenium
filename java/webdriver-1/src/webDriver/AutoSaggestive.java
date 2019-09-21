package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSaggestive {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/JM/greenFox/selenium/java/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		

		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000L);

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);

	}

}
