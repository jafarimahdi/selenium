package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void demo() {
		System.out.println("first test");
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
