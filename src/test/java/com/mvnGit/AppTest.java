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
	
	@Test
	public void doLogin() throws InterruptedException{
		driver.get("http://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(10L);
		driver.findElement(By.id("login1")).sendKeys("abdulhakeem.h@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abcd");
		
}

	@AfterSuite
	public void tearDown(){
		driver.quit();
	}
	
}