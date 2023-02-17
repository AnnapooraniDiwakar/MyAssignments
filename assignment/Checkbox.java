package week2day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANNAPOORANI\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		 driver.findElement(By.xpath("//span[text()='Basic']")).click(); 
		  driver.findElement(By.xpath("//span[text()='Ajax']")).click(); 
		  driver.findElement(By.xpath("//label[text()='Java']")).click(); 
		  driver.findElement(By.xpath("//label[text()='Python']")).click();
		  driver.findElement(By.xpath("//label[text()='Javascript']")).click();  
		driver.findElement(By.xpath("//label[text()='Others']")).click(); 
		  
		//driver.close();
	}

}
