package Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	public static void main(String[] args) {
 						
				
			//1. Chrome Launch
				System.setProperty("webdriver.chrome.driver","D:\\Core Java Training\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();	// Launch Chrome  (Need to download Chrome driver)
				driver.get("http://www.google.com");	// Enter url
				String title = driver.getTitle(); 		// Get title
				System.out.println(title);				// Chrome tab name is called Title
				
				
				//validation point
				if((title.equals("Google"))){
					System.out.println("Correct Title");
				}
				else{

					System.out.println("Incorrect Title");
				}
	
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource()); //Interview Question
	//driver.quit(); 									// To close Google chrome
	}

}
