package day2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		//maximize page
		driver.manage().window().maximize();
		
		//isDisplayed()
		
		 WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo:"+logo.isDisplayed());
		
		//isEnabled()
		boolean status=driver.findElement(By.id("small-searchterms")).isEnabled();
		System.out.println("Enable status is:"+status);
		
		//isSelected()
		WebElement male_rd=driver.findElement(By.id("gender-male"));
		WebElement female_rd=driver.findElement(By.id("gender-female"));
		
		System.out.println("----------before selecting-------");
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//false
		
		System.out.println("-----after selecting male radio button-------");//you can select 1 at a time
		male_rd.click();//select male radio button
		System.out.println(male_rd.isSelected());//true
		System.out.println(female_rd.isSelected());//false
		
		boolean Newsletterst=driver.findElement(By.id("Newsletter")).isSelected();
		System.out.println("New Sletter status:"+Newsletterst);
		
		
	}

}
