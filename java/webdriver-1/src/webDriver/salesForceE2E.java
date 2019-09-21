package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForceE2E {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","/Users/JM/greenFox/selenium/java/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("jafari hamid");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodBy");
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		
		
	}

}
