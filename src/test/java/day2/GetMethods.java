package day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//1)get(URL)-opens the URL on the browser.
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		//2)getTitle()-returns title of the web page
		 String title=driver.getTitle();
		 System.out.println(title);//OrangeHRM
		 
		 //3)getcurrentUrl()-returns URL of the web page
		//System.out.println(driver.getCurrentUrl());
		
		//4)getPageSource()-returns source code of page
		//System.out.println(driver.getPageSource());
		
		//5)getWindowHandle()-returns ID of the single Browser window
		String WindowID=driver.getWindowHandle();
		System.out.println(WindowID);//it is keeps changing 
		
		//6)getWindowHandles()-returns ID's of multiple browser windows
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();//this will open new browser window
		Set<String>windowIds=driver.getWindowHandles();//returns multiple ID's(Set collection)
		System.out.println(windowIds);

	}

}
