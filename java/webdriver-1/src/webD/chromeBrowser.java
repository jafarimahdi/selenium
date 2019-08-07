package webD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/JM/greenFox/selenium/java/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("123456789");
		driver.findElement(By.linkText("Forgotten account?")).click();
		
	}
}

