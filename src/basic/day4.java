package basic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Test(groups= {"Smoke"})
public void lion() {
	
	System.out.println("lion");
}
	
	@Test
	public void tiger() {
		
		System.out.println("tiger");
	}
	
	//we defining it in the test in xml to particular class
	@Parameters({"URL"})
	@Test
	public void wolf(String uname) {
		
		System.out.println("wolf");
		System.out.println(uname);
		//System.out.println(zname);
	}
	
}
