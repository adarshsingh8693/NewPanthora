package practicepackage;

import org.testng.annotations.Test;

public class CMDExcecution{
	
	@Test
	public void  test() {
		String BROWSER=System.getProperty("browser");
		String URL=System.getenv("PROCESSOR_LEVEL");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		
	}

}
