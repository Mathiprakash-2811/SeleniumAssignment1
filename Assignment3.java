package seleniumassignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" http://leaftaps.com/opentaps/.");
		
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.partialLinkText("Accounts")).click();
		
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Mathi12");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		
		driver.findElement(By.className("smallSubmit")).click();
        
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//verify 
		if(Title.contains("Account Details")) {
			System.out.println("page is verfied");
		}else {
			System.out.println("Page is not verfied");
		}
		driver.close();
		}

}
