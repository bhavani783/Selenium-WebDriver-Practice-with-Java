package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAllCheckBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select all check boxes(if we have less check boxes we can write x path)-we have more ,so we can use list
		List<WebElement> Checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		for(int i=0;i<Checkboxes.size();i++) {
			Checkboxes.get(i).click();
			//get the values of the check boxes
			String day=Checkboxes.get(i).getAttribute("value");
			System.out.println("Selected :"+ day);
		}

	}

}
