package com.qa.testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.session.ChromeFilter;


public class moneycontrol {
WebDriver driver; 

public void operation() throws Exception {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Mavenjava\\src\\test\\java\\amazon\\Property.properties");
	prop.load(fis);
	String browsername = prop.getProperty("bnrowser");
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	}
	driver.findElement(By.xpath("//a[@title = 'Log In']")).click();

}
	public static void main(String[] args) {

	}

}
