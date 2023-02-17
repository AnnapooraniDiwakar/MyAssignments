package week2day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		 
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		 driver.findElement(By.linkText("Phone")).click();
		 
		 driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
		 
		 driver.findElement(By.className("x-btn-text")).click();
		 
		 WebElement leadID1 = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a)[1]"));
		 
	        String firstId = leadID1.getText();
	        
	        System.out.println(firstId);
	        Thread.sleep(5000);
	        leadID1.click();
	        
	        
	       driver.findElement(By.linkText("Delete")).click();
	        
	        driver.findElement(By.linkText("Find Leads")).click();
	        
	        driver.findElement(By.name("id")).sendKeys(firstId);
	       	        
	        driver.findElement(By.linkText("Find Leads")).click();
	        
	        String title1 = driver.getTitle();
			
			System.out.println(title1);

	        if(driver.getTitle().contains(firstId))
	        {
	        	System.out.println("Record is displayed ");
	        }
	        else
	        {
	        	System.out.println("No Record is displayed ");
	        }
	        
	        //driver.close();
	}

}
