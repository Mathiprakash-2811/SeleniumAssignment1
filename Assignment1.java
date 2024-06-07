package seleniumassignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

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
		
		driver.findElement(By.id("accountName")).sendKeys("MKMP12");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	
		WebElement db1 = driver.findElement(By.name("industryEnumId"));
        Select options1 = new Select(db1);
	    options1.selectByVisibleText("Computer Software");
		
		WebElement db2 = driver.findElement(By.name("ownershipEnumId"));
        Select options2 = new Select(db2);
	    options2.selectByVisibleText("S-Corporation");
		
		WebElement db3 = driver.findElement(By.name("dataSourceId"));
        Select options3 = new Select(db3);
	    options3.selectByValue("LEAD_EMPLOYEE");
		
	    WebElement db4 = driver.findElement(By.name("marketingCampaignId"));
        Select options4 = new Select(db4);
	    options4.selectByIndex(5);
		
		WebElement db5 = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select options5 = new Select(db5);
	    options5.selectByValue("TX");
		
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 WebElement accountNameElement = driver.findElement(By.xpath("//span[contains(text(),'MKM')]"));
	     String accountName = accountNameElement.getText();
	     System.out.println(accountName);
         if (accountName.contains("MKMP12")) {
         System.out.println("Account created successfully with name: " + accountName);
         } 
         else {
         System.out.println("Account creation failed. Displayed account name: " + accountName);
         }
         driver.close();
			}
}
