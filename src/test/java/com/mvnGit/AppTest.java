package com.mvnGit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class AppTest {
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup(){
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		
		
	}
	
	//Test Method ---main script
	@Test
	public void doLogin() throws InterruptedException{
		driver.get("http://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(10L);
		driver.findElement(By.id("login1")).sendKeys("abdulhakeem.h@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abcd");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		/*
		 * 
		 * 
		 * this is rediff login method test
		 * added comments
		 */
		 
}

	// tear down method --- close the browser
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}
	
}
