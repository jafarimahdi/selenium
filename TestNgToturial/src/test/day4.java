package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({ "URL" })
	@Test
	public void webloginHomeloan(String urlName) {
		System.out.println("webLoginHome");
		System.out.println(urlName); // driver.get(urlName)
	}

	@Test(groups = { "smoke" })
	public void mobileLoginHomeloan() {
		System.out.println("mobileLoginHome");
	}

	@Test
	public void loginApiHomeloan() {
		System.out.println("ApiLoginHome");
	}
}
