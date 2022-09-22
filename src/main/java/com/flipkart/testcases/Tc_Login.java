package com.flipkart.testcases;

import org.testng.annotations.Test;

import com.flipkart.pageObjects.LoginPage;
import com.flipkart.utilities.BaseClass;

public class Tc_Login extends BaseClass {
	LoginPage lp;
	
	@Test
	public void loginTest() throws InterruptedException {
		lp=new LoginPage(driver);
		Thread.sleep(5000);
		//lp.clicklogin();
		String username=getValue.setUserName();
		lp.username(username);
		String password=getValue.setUserName();
		lp.password(password);
		lp.submit();
		Thread.sleep(5000);
		
		
	}

}
