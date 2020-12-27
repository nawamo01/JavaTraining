package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserScript {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
            //System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
		System.setProperty("webdriver.chrome.driver","D:\\Core Java Training\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.softwaretestingmaterial.com/software-testing-interview-questions-free-ebook/");
            System.out.println("Selenium Webdriver Script in Chrome browser | Software Testing Material");
            driver.close();
     }

	}


