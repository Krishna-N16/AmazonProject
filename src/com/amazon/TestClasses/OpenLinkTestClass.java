package com.amazon.TestClasses;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.amazon.POMClasses.HomePage;



public class OpenLinkTestClass extends TestBaseClass {

	@Test
	public void linkOpen() throws AWTException, InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.openLink("Amazon Assistant Download");
		List <String> handles= new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(handles.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(handles.get(0));  
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
