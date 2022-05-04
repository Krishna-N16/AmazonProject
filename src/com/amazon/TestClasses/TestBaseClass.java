package com.amazon.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass {

	WebDriver driver;
	@BeforeMethod
	public void setUpMethod()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kk\\Desktop\\chromedriver.exe");
		System.out.println("Properties are set for chrome driver");
	
	    driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
}
