package week2day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

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

		 driver.findElement(By.linkText("Contacts")).click();
		 
		 driver.findElement(By.linkText("Create Contact")).click();
		 
		 driver.findElement(By.id("firstNameField")).sendKeys("Annapoorani");
		 
		 driver.findElement(By.id("lastNameField")).sendKeys("Diwakar");
		 
         driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Anu");
         
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Diwa");
		 
		 driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("Selenum");
		 
		 driver.findElement(By.className("inputBox")).sendKeys("CSE");
		 
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Testing");
		 
		 driver.findElement(By.className("inputBox")).sendKeys("anu.n249@gmail.com");
		 
		 WebElement ww = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 
	Select d2=new Select(ww);
	
	d2.selectByVisibleText("New York");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	driver.findElement(By.linkText("Edit")).click();
	
	driver.findElement(By.name("description")).clear();
	
	driver.findElement(By.name("importantNote")).sendKeys("Automation testing");
	
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	
	String title = driver.getTitle();
	
	System.out.println(title);
	}

}
