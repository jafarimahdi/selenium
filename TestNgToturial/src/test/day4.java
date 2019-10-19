package test;

import org.testng.annotations.Test;

public class day4 {

	@Test
	public void webloginHomeloan() {
		System.out.println("webLoginHome");
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
