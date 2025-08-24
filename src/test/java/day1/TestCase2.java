package day1;

import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.WebDriver; 
/*
 * Test case
 * -----------
 * 1)Launch browser(Chrome)
 * 2)Open Url "http://localhost/opencart/upload"--->in my local system
 * 3)Validate title should be "Your Store"
 * 4)Close Browser
 */
public class TestCase2 {

	public static void main(String[] args) {
		
		//launching the browser(Chrome)
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//open the url https://demo.opencart.com/
		 driver.get("http://localhost/opencart/upload");

	}

}
