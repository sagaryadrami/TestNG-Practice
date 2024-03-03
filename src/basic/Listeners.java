package basic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("successfully writing the listeners");
		
	}
}
