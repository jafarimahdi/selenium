package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/JM/greenFox/selenium/java/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com");

		// normal way for the dropDown Target

		Select s = new Select(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_DropDownListCurrency\']")));
		s.selectByValue("AED");
		s.selectByIndex(3); // we can use also index for the selecting the target
		s.selectByVisibleText("INR"); // also possible to use innerText

		// for new way of dropDown Target

		driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
		Thread.sleep(2000);
		for (int i = 1; i < 3; i++) {
			driver.findElement(By.xpath("//*[@id=\"hrefIncAdt\"]")).click();
		}

		driver.findElement(By.xpath("//*[@id=\"btnclosepaxoption\"]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).getText());

		driver.close();

	}

}
