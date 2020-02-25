package testNgDemo;

import org.testng.annotations.*;

public class TestNgDemoOne {
	@Test
	public void testMethodOne() {
		System.out.println("Annotation method one is executed");
	}
	@Test
	public void testMethodTwo() {
		System.out.println("Annotation methos two is executed");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method is executed");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After methos is executed");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class methos is executed");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class method is executed");
	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite is executed");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite is executed");
	}
}
