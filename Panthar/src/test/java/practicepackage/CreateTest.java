package practicepackage;

import org.testng.annotations.Test;

public class CreateTest {
	
	
	@Test(groups= {"smoke"})
	public void test09() {
		System.out.println("I am in test 09 smoke");
	}

	@Test(groups= {"sanity"})
	public void test10() {
		System.out.println("I am in test 010 sanity");
	}

	@Test(groups= {"sanity","smoke"})
	public void test11() {
		System.out.println("I am in test 11 sanity and smoke");
	}

}
