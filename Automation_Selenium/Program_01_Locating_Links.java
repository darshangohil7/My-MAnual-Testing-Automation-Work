package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_Locating_Links 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Cart")).click(); // Link Text.
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("om")).click(); // Partial Link Text.
		
	}
}