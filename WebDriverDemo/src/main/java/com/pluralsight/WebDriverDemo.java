package com.pluralsight;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
			
		//WebDriver driver = new FirefoxDriver();
		//Chrome driver must match Chrome version for below to work
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		WebElement searchField = driver.findElement(By.cssSelector(".gLFyf"));
		searchField.sendKeys("pluralsight");
		searchField.submit();
		
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		
/*		WebElement imageElement = driver.findElements(By.cssSelector("a[class=rg_l]")).get(0);
		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		imageLink.click();
*/		
		//fix the below
		WebElement imageElement = driver.findElements(By.cssSelector("a[class=rg_l]")).get(0);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", imageElement);
		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		executor.executeScript("arguments[0].click();", imageLink);
	}
}
