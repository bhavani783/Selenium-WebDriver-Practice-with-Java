package day6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		//approach1(convert the set into list)
		List<String> windowList=new ArrayList(windowIDs);
		//get individual window IDs
		String parentID=windowList.get(0);
		String childID=windowList.get(1);
		
		System.out.println(driver.getTitle());//get parent window title(OrangeHRM)
		//switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());//Human Resources Management Software | HRMS | OrangeHRM
		
		//switch to parent window
		driver.switchTo().window(parentID);
		driver.quit();
		
		
	}

}
