package com.flipkart.utilities;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class BaseClass {
	public WebDriver driver;
	public ReadConfig getValue;
	
	@BeforeTest
	public void setup() throws FileNotFoundException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		getValue=new ReadConfig();
		driver.get(getValue.readUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
