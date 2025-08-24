package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopcommerceRegisterFunctionality {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//get URL
		driver.get("https://demo.nopcommerce.com/register");
		String title=driver.getTitle();
		System.out.println(title);
		//x path for radio button
		driver.findElement(By.xpath("//input[@value='F']")).click();
		//xpath for first name
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Gnagadevi");
		//xpath for last name
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("G");
		//xapth for email
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("ganga@123gmail.com");
		
		//x path for company details
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("N/A");
		//x path for password
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("ganga@123");
		//x path for confirm password
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("ganga@123");
		//x path for register button
		driver.findElement(By.xpath("//button[@name='register-button']")).click();
		
		//check candidate exist or nor
		driver.findElement(By.xpath("//div[@class='footer-block my-account']//li[1]//a[1]")).click();
		
		System.out.println(driver.getCurrentUrl());//https://demo.nopcommerce.com/login?ReturnUrl=%2Fcustomer%2Finfo
		
		
		
	
	}

}
