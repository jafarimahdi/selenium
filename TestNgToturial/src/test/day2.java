package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups = { "smoke" })
	public void ploan() {
		System.out.println("secound class");
	}

	@BeforeTest
	public void prerequeiste() {
		System.out.println("I will execute first");
	}

}
