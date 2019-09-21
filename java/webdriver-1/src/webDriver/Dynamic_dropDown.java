package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/JM/greenFox/selenium/java/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");

		Thread.sleep(6000L);

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Gorakhpur (GOP)')]")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[5]/a")).click();

	}

}
