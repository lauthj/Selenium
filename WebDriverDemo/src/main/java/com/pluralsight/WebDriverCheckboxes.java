package com.pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Joseph.Lauth/git/Selenium/WebDriverDemo/src/main/webapp/CheckboxTest.html");
		
		WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
		
		checkbox.click();

	}

}
