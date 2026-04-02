package practicepackage;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrm {
	
	@Test
	public void createEmp() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(2000);
		Random ran=new Random();
		int random=ran.nextInt(500);
		String first="Adarsh"+random;
		String last="Singh";
		driver.findElement(By.name("firstName")).sendKeys(first);
		driver.findElement(By.name("lastName")).sendKeys(last);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).submit();
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.xpath("//label[text()='Nationality']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-select-text--after']"));
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		Thread.sleep(3000);
		ele.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-select-option']/child::span[text()='Indian']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Marital Status']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-select-text--after']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-select-option']/child::span[text()='Single']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Date of Birth']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@placeholder='yyyy-dd-mm']")).sendKeys("2000-26-03");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']/following-sibling::span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Employee Name']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys(first+" "+last);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='oxd-form-actions']//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		
		List<WebElement> text = driver.findElements(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']//div"));
	 
		boolean flag=false;
		for(WebElement t:text) {
	    	  
	    	  String expected = t.getText();
	    	 if(expected.equals("xyz")) {
	    		 
	    		 flag=true;
	    		 System.out.println("found");
	    		break; 
	    	 }
	    	 else {
	    		 System.out.println("notfound");
	    	 }
	      }
		Assert.assertTrue(flag);
	      driver.quit();
	
	
	}

}
