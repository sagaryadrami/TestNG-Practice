package basic;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class day2 {

	

	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("gello");
	}
	
	
	@Parameters({"URL"})
	@Test
	public void ploan2(String urlname)
	{
		System.out.println("hello");
		System.out.println(urlname);
	}
	
	@Test
	public void ploan3()
	{
		System.out.println("iello");
	}
	
	@BeforeTest
	public void ploan4()
	{
		System.out.println("i will excute first");
	}
	
	@Test(dataProvider="getdata")
	public void ploan5(String username,String password)
	{
		System.out.println("i will excute first");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@DataProvider(name="getdata")
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		
		data[0][0]="firstSetUsername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondSetUsername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdSetUsername";
		data[2][1]="thirdpassword";
		
		return data;
		
	}
}
