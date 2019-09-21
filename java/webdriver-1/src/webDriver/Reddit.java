package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddit {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/JM/greenFox/selenium/java/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("my Email");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("new password");
		driver.findElement(By.xpath("//*[@value='Go']")).click();

		// driver.close();
	}
}
