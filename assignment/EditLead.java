package week2day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANNAPOORANI\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

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
		
		//driver.findElement(By.name("primaryEmail")).sendKeys("anu.n249@gmail.com");
		
		WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select dd = new Select(element);
		
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
        driver.findElement(By.className("subMenuButton")).click();
		
		driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.name("importantNote")).sendKeys("Testing and Developing");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);

	}

}
