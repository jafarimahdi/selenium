package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class day3 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("before executing any methods in the class");
	}
	
	@Parameters({"url"})
	@Test
	public void webloginCarloan(String urlName) {
		System.out.println("webLoginCar");
		System.out.println(urlName);   // driver.get(urlName)
	}

	@Test(groups = { "smoke" })
	public void mobileLoginCarloan() {
		System.out.println("mobileLoginCar");
	}

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("I am number 1");
	}

	@Test(enabled=false)
	public void MobileSingInCarlon() {
		System.out.println("Mobile singIn");
	}

	@Test(timeOut=3000)
	public void MobileSingOutCarlon() {
		System.out.println("Mobile singOut");
	}

	@Test(dependsOnMethods = { "webloginCarloan", "MobileSingOutCarlon" })
	public void ApiLoginCarloan() {
		System.out.println("ApiLoginCar");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Excute before every method in class day3 ");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("Excute after every method in class day3");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After excuting all the methods in the class");
	}
}
