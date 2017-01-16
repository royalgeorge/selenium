//program to demonstrate webelement commands

package com.test.achu4.achu4;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;


public class achu4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.google.co.uk");
	    WebElement element = driver.findElement(By.name("oq"));
	    System.out.println(element);
	    WebElement body = driver.findElement(By.tagName("body"));
	    System.out.println(body);
		WebElement element1 = driver.findElement(By.id("lst-ib"));
		System.out.println(element1);
		element1.sendKeys("tutorial\t");
		//these are not working
		// Actions action = new Actions(driver);
		// action.sendKeys(Keys.SPACE);
		// element1.sendKeys(Keys.SPACE);
		//element1.sendKeys(Keys.TAB);
		element1.sendKeys("selenium");
		element1.submit();
		//element1.clear();(it will clear the text typed in the box
		
		
	}

}
