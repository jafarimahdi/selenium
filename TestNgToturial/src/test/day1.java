package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;

public class day1 {

	@Test
	public void demo() {
		System.out.println("first test");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("I am the number 1 form last");
	}

	@Test
	public void secound() {
		System.out.println("secound one");
	}

	@AfterTest
	public void lastexecute() {
		System.out.println("I will execute last");
	}

}
