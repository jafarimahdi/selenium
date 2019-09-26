package webDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Calander {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/JM/greenFox/selenium/java/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com");

		SimpleDateFormat formatter = new SimpleDateFormat("dd"); // get the current time with date class
		Date date = new Date();

		String now = formatter.format(date);
		System.out.println(now);

		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_view_date1\']")).click();
		
		String textOne = driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).getText(); //use the CssSelector class for the current date
		System.out.println(textOne);

		Assert.assertEquals(now, textOne);

		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
		// Assert.assertFalse(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).isSelected());

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("yes");
			Assert.assertTrue(true);
		} else {
			System.out.println("no");
			Assert.assertTrue(false);
		}

		Thread.sleep(5000L);
		driver.close();

	}
}
