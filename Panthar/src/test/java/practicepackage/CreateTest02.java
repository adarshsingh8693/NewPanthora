package practicepackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateTest02 {
	
	
	@Test(groups= {"sanity"})
	public void Test04() {
		System.out.println("I am in test 04 sanity");
	}
	@Test(groups= {"smoke"})
	public void Test05() {
		System.out.println("I am in test 05 smoke");
	}
	@Test(groups= {"sanity","smoke"})
	public void Test06() {
		System.out.println("I am in test 06 sanity and smoke");
	}
	@Test(groups= {"smoke"})
	public void Test07() {
		System.out.println("I am in test 01 smoke");
	}
	@Test(groups= {"sanity"})
	public void Test08() {
		System.out.println("I am in test 01 sanity");
	}

	

}
