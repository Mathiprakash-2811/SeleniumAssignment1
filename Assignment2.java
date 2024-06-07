package seleniumassignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" http://leaftaps.com/opentaps/.");
		
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.partialLinkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mathi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("prakash");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Employee");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.name("submitButton")).click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//verify 
		if(Title.contains("View Lead")) {
			System.out.println("page is verfied");
		}else {
			System.out.println("Page is not verfied");
		}
		
        driver.close();
	}

}
