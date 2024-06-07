package seleniumassignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Mathi");
		
		driver.findElement(By.name("lastname")).sendKeys("prakash");
		
		driver.findElement(By.name("reg_email__")).sendKeys("mathi@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mathi@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Mahi@789");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("11");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Oct");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2008");
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
	}

}
