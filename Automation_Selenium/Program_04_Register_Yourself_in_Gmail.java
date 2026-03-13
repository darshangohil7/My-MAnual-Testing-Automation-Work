package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_04_Register_Yourself_in_Gmail 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver-win64_145\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp/");
		//driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=http%3A%2F%2Fsupport.google.com%2Fmail%2Fanswer%2F56256%3Fhl%3Den&ec=GAlAdQ&hl=en&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S127002%3A1768303965436700");		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/main/div[3]/div/div[2]/div/div/div[1]/div/button/span")).click();
		//Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/main/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]")).click();
		driver.findElement(By.name("firstName")).sendKeys("Tony");
		//Thread.sleep(1500);
		driver.findElement(By.name("lastName")).sendKeys("Stark");
		//Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button")).click();
		Thread.sleep(1500);
		//driver.get("https://accounts.google.com/lifecycle/steps/signup/birthdaygender?TL=APgKAca0CpcjQQhMYrjhl-2Z5RFUGIvDlfkgl62ug8m9ldymgkYgVGoa-LKI_HLk&authuser=0&continue=http%3A%2F%2Fsupport.google.com%2Fmail%2Fanswer%2F56256%3Fhl%3Den&dsh=S127002%3A1768303965436700&ec=GAlAdQ&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en");
		driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("22");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"month\"]/div/div[1]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"month\"]/div/div[2]/ul/li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("year")).sendKeys("1999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"gender\"]/div/div[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"gender\"]/div/div[2]/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/main/div[2]/div/div/div/span/section/div/div/div/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("tony1stark2mark42");
		driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("Tony@Stark42");
		driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("Tony@Stark42");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/main/div[2]/div/div/div/span/section/div/div/div/div[3]/div/div[1]/div/div/div[1]/div/div/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span")).click();
	}

}
