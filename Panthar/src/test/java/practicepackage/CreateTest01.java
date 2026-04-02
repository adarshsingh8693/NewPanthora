package practicepackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateTest01 {
	
	@Test(groups= {"sanity"})
	public void Test01() {
		System.out.println("I am in test 01 sanity");
	}
	@Test(groups= {"smoke"})
	public void Test02() {
		System.out.println("I am in test 01 smoke");
	}
	@Test(groups= {"sanity","smoke"})
	public void Test03() {
		System.out.println("I am in test 03 sanity and smoke");
	}
	@Test(groups= {"smoke"})
	public void Test04() {
		System.out.println("I am in test 01 smoke");
	}
	@Test(groups= {"sanity"})
	public void Test05() {
		System.out.println("I am in test 05 sanity");
	}

}
