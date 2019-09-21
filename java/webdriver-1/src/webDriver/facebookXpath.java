package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","/Users/JM/greenFox/selenium/java/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		/*
					use the XPath way for the selector
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("my-Own-xPath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		*/
		
		// use the CSS way for the selector 
		
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myOwnEmail");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		
		
	}

}
