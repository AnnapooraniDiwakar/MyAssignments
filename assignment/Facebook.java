package week2day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ANNAPOORANI\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Anu");
		
		driver.findElement(By.name("lastname")).sendKeys("Diwa");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		
		driver.findElement(By.id("password_step_input")).sendKeys("xyz");
		WebElement  web = driver.findElement(By.name("birthday_day"));
		
		Select ss=new Select(web);
		
		ss.selectByValue("24");
		
		WebElement web1 = driver.findElement(By.name("birthday_month"));
		
		Select ss1=new Select(web1);
		
		ss1.selectByValue("9");
		
		WebElement web2 = driver.findElement(By.name("birthday_year"));
		
		Select ss2=new Select(web2);
	
		
		ss2.selectByValue("1995");
		
 driver.findElement(By.name("sex")).click();

	}

}
