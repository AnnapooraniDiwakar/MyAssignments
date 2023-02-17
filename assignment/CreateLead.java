package week2day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANNAPOORANI\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Leads")).click();
		 
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Annapoorani");
		 
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Diwakar");
		 
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anu");
		 
		 driver.findElement(By.name("departmentName")).sendKeys("Testing");
		 
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Testing");
		 
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anu.n249@gmail.com");
		 
		 WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 
			Select d1= new Select(state);
			
			d1.selectByVisibleText("New York");
			
			driver.findElement(By.className("smallSubmit")).click();
			
			  String title1 = driver.getTitle();
				
				System.out.println(title1);
			
			Thread.sleep(5000);
	}

}
