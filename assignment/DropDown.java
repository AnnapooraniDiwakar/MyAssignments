package week2day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANNAPOORANI\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

WebElement ele = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	Select dd=new Select(ele);
	dd.selectByIndex(3);
	driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	driver.findElement(By.xpath("//li[text()='India']")).click();
	driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).click();
	driver.findElement(By.xpath("//label[text()='Select Language']")).click();
	driver.findElement(By.xpath("//li[text()='English']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//label[text()='Select Values']")).click();
	driver.findElement(By.xpath("//li[text()='Two']")).click();
	Thread.sleep(5000);
	driver.close();
	
	}

}
