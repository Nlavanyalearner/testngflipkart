package com.flipkart.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	public Properties prop;
	
	public ReadConfig() throws FileNotFoundException {
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\hybridframework\\config.properties");
		FileInputStream src=new FileInputStream(file);
		prop=new Properties();
		try {
			prop.load(src);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public String readUrl() {
	String appUrl=prop.getProperty("url");
		return appUrl;
	}
	

	public String setUserName() {
	String readUserName=prop.getProperty("username");
		return readUserName;
	}
	

	public String setPassword() {
	String readPassword=prop.getProperty("password");
		return readPassword;
	}
	



}
