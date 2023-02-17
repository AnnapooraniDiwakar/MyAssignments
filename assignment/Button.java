package week2day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANNAPOORANI\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/button.xhtml");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']")).click();
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		boolean button = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		
		System.out.println(button);
		
		Thread.sleep(5000);
		
		Point location = (Point) driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		
		System.out.println(location);
		
		driver.close();
	}

}
