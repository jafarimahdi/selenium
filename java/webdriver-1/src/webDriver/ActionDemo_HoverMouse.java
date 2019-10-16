package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo_HoverMouse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JM/greenFox/selenium/java/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		options.addArguments("--disable-notifications"); // Handle the notifications
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.alibaba.com");

		
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//li[@class='category-item-wrapper vmore']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='Minerals & Metallurgy']")).click();
		driver.findElement(By.xpath("//image[@title='Auto Refinish Nano Ceramic Car Coating MR-FIX 9H Auto Ceramics Coating']")).click();
		//driver.close();

	}


}
