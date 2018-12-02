package com.growsure.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class homePage{
	
	//@FindBy(xpath="")
	//WebElement homePageHeader;
	
	public void verifyHeaderContent(WebDriver driver) {

		String[] arr = { "Home", "About Us", "Courses", "Corporate Training", "Contact Us" };
		int size = driver.findElements(By.xpath("//nav/ul/li/a/strong")).size();
		for (int i = 1; i <= size; i++) {
			String text = driver.findElement(By.xpath("(//nav/ul/li/a/strong)[" + i + "]")).getText();
			System.out.println(text);
			
			if (arr[i-1].equalsIgnoreCase(text)) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}

	}

	public void toVerifyImage(WebDriver driver) {
		String text = driver.findElement(By.xpath("//img[@id='header_alt_logo']")).getAttribute("src");
		System.out.println(text);
	}
	
}
