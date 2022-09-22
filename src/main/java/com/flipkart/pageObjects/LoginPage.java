package com.flipkart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver1,this);
		
	}
	@FindBy(xpath = "//a[.='Login']")
	WebElement Loginbutton;
	
	@FindBy(xpath = "//input[@class=\"_2IX_2- VJZDxU\"]")
	WebElement userName;
	
	@FindBy(xpath = "//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")
	WebElement password;
	
	@FindBy(xpath = "//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")
	WebElement submitLogin;
	
	
	public void clicklogin() {
		Loginbutton.click();
	}
	
	public void username(String user) {
		userName.sendKeys(user);
	
	}
	public void password(String pass) {
		password.sendKeys(pass);
	
	}
	
	public void submit() {
		submitLogin.click();
	}
	

	

}
