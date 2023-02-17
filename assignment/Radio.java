package week2day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANNAPOORANI\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();
		
		driver.findElement(By.xpath("//label[text()='Safari']")).click();
		
		driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
		
		//driver.close();
	}

}
