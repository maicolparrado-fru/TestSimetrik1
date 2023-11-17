package com.demo.cucumberselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CucumberseleniumApplication {

	public static void main(String args[]) {

		WebDriver driver;

		//Setting system properties of ChromeDriver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\elmartinez\\Documents\\cucumberselenium\\cucumberselenium\\src\\test\\java\\com\\demo\\drivers\\chromedriver.exe");

		//Creating an object of ChromeDriver
				driver = new ChromeDriver();

		//launching the specified URL
				driver.get("https://bstackdemo.com/");
	}

}
