package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalMethod1 {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//navigate().to()
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		//2)navigate().back()	
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());//1st URL we will get
		
		//3)navigate().forward()
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());//2nd URL we will get
		
		//4)navigate().refresh()
		driver.navigate().refresh();
		
	}

}
