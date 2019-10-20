package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class day3 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("before executing any methods in the class");
	}

	@Parameters({ "URL", "ApiKey/UserName" })
	@Test
	public void webloginCarloan(String urlName, String Apikey) {
		System.out.println("webLoginCar");
		System.out.println(urlName); // driver.get(urlName)
		System.out.println(Apikey); // .sendKeys(Api)
	}

	@Test(groups = { "smoke" })
	public void mobileLoginCarloan() {
		System.out.println("mobileLoginCar");
	}

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("I am number 1");
	}

	@Test(enabled = false)
	public void MobileSingInCarlon() {
		System.out.println("Mobile singIn");
	}

	@Test(dataProvider = "getData")
	public void MobileSingOutCarlon(String userName, String password) {
		System.out.println("Mobile singOut");
		System.out.println(userName);
		System.out.println(password);
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

	@DataProvider
	public Object[][] getData() {

		// 1-combination- userName password - good credit
		// 2- userName password - no credit history
		// 3- Fertility credit History

		Object[][] data = new Object[3][2];

		data[0][0] = "First user";
		data[0][1] = "Password 1";

		data[1][0] = "Secound user";
		data[1][1] = "password 2";

		data[2][0] = "Therid user";
		data[2][1] = "password 3";

		return data;

	}
}
