package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOnly3Checkboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//X path for select elements
		List<WebElement> Checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		//select only 3 check boxes
		for(int i=0;i<3;i++) {
		Checkboxes.get(i).click();
		String day=Checkboxes.get(i).getAttribute("value");
		System.out.println("Selected :"+ day);
			
		}
		
		//un select check boxes if they are selected
		for(int i=0;i<3;i++) {
			Checkboxes.get(i).click();//for un select also we can click 1 more time
			String day=Checkboxes.get(i).getAttribute("value");
			System.out.println("UnSelected :"+ day);
		}
		

	}

}
