package webDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchroniztion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/JM/greenFox/selenium/java/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com");

		// driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); //
		// Synchronisation => implicitly

		driver.findElement(By.xpath("//label[@for='hotel-car-package-type-hp-package']")).click();
		driver.findElement(By.id("hotel-destination-hp-package")).sendKeys("nyc");

		driver.findElement(By.id("hotel-destination-hp-package")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath(
				"//section[contains(@class,'package-form-fields')]//div[contains(@class,'col gcw-wide-location-field')]"
						+ "//button[contains(@class,'btn btn-clear')]"))
				.sendKeys(Keys.TAB);

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); // get the current time with date class
		String now = formatter.format(date);

		driver.findElement(By.xpath("//input[@id='package-hc-departing-hp-package']")).sendKeys(now);

		driver.findElement(By.xpath("//input[@id='package-hc-departing-hp-package']")).sendKeys(Keys.ENTER);

		driver.findElement(By.linkText("New York, NY, United States (JFK-John F. Kennedy Intl.)")).sendKeys(Keys.ENTER);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'New-York-Hotels-The-Roosevelt-Hotel')]")));
	//  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("  "));
		
		driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-The-Roosevelt-Hotel')]")).click();

		driver.close();
		// driver.quit();

	}

}
