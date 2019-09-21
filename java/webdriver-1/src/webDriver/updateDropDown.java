package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/JM/greenFox/selenium/java/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
	
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
			
			Thread.sleep(2000L);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

		for (int i = 1; i < 3; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}


		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}
}
