package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before executing the methods in the class");
	}
	
	@AfterClass
	public void Afterclass() {
		System.out.println("after executing the methods in the class");
	}
	
	
	
	@AfterSuite
	public void afsuite() {
		System.out.println("i will be the last");
	
	}
	
	
	@AfterTest
	public void car() {
		System.out.println("after test");
	
	}
	
	//TestNG runs methods in alphabetic order
	//when we want to run certain method first because it might give values to ther method as input
	@Test(dependsOnMethods= {"submarine","zoo"})
	public void carloan() {
		System.out.println("car");
	
	}
	
	@BeforeMethod
	public void before() {
		System.out.println("Before every method in the day3 class");
	
	}
	
	@AfterMethod
	public void after() {
		System.out.println("after every method in the day3 class");
	
	}
	
	@Test(groups= {"Smoke"})
	public void submarine() {
		System.out.println("submarine");
	
	}
	
	@BeforeSuite
	public void bfsuite() {
		System.out.println("I will be the first");
	
	}
	
	@Test
	public void zoo() {
		System.out.println("Zoo");
	
	}
	
	@Test
	public void van() {
		System.out.println("van");
	
	}
	
	
	//when we does not want this method to stop working
	@Test(enabled=false)
	public void machine() {
		System.out.println("machine");
	
	}
	
	
	//when we know certain methods are taking time to run then we do timeOut
	@Test(timeOut=4000)
	public void truck() {
		System.out.println("truck");
	
	}
}
