package testNgDemo;

import java.util.concurrent.atomic.AtomicInteger;

import org.testng.annotations.*;

public class TestNgDemoOne2 extends TestNgDemoOne{

//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("Before test method is executed");
//	}
//	@AfterTest
//	public void afterTest() {
//		System.out.println("After test method is executed");
//	}

	public class InvocationTest {
	    AtomicInteger sequence = new AtomicInteger(0);	
	    @Test(invocationCount = 5, threadPoolSize = 2)
	    public void test1(){
	        int count= sequence.addAndGet(1);
	        System.out.println("Test Run Number  "+
	                count + " run by Thread  " + Thread.currentThread().getId());

	
	    }}}
