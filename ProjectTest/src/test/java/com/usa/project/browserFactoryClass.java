package com.usa.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserFactoryClass {
	private static String URL="http://mock.agiletrailblazers.com/contact.html";
	
	public static WebDriver getBrowser(String browserName,WebDriver driver) throws InterruptedException{
		
		if(browserName.equalsIgnoreCase("IE")){
			
			System.setProperty("webdriver.ie.driver", ",/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		if(browserName.equalsIgnoreCase("Chrome")){
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FireFox")){
			driver =new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		return driver;
	}
	
	
	public static String getURL() {
		return URL;
	}
	}