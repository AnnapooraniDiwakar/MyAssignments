package week2day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANNAPOORANI\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			
			driver.manage().window().maximize();
			
		    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		    
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
			
			driver.findElement(By.linkText("Create Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Annapoorani");
			
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Diwakar");
			
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anu");
			
			driver.findElement(By.name("departmentName")).sendKeys("Testing");
			
			driver.findElement(By.name("description")).sendKeys("Automation Testing");
			
			/*
			 * WebDriverWait wait = new WebDriverWait(driver,10);
			 * wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name
			 * ("primaryEmail"))));
			 */
		//	driver.findElement(By.name("primaryEmail")).click();
			
			//driver.findElement(By.name("primaryEmail")).sendKeys("anu.n249@gmail.com");
			
			WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			
			Select dd = new Select(element);
			
			dd.selectByVisibleText("New York");
			
			driver.findElement(By.className("smallSubmit")).click();
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			driver.findElement(By.linkText("Duplicate Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Webco");
			
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yakshu");
			Thread.sleep(5000);
			driver.findElement(By.linkText("Create Lead")).click();
			
			String title1 = driver.getTitle();
			
			System.out.println(title1);
			

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			driver.close();
		}
				
		

	}

}
