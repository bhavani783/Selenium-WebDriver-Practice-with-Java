package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {

	public static void main(String[] args)throws MalformedURLException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//accepts URL only in the form of string
		//1)navigate().to(URL)-->approach1
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//navigate().to(URL Object)-->approach2
	URL myurl=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(myurl);
		;
		driver.manage().window().maximize();
	
	
	}

}
