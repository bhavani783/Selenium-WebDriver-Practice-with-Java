package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginFunctionality {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		//x path for user name
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//x path for password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//x path for login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.getCurrentUrl());
	

	}

}
