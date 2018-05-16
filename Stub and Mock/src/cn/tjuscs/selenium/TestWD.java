package cn.tjuscs.selenium;


import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWD {
	private WebDriver driver;
	private String baseUrl;
	
	@Before
	public void setUp() throws IOException {
		driver = new FirefoxDriver();
//		String chDriver = new File(new File(".").getCanonicalPath()+"\\" 
//				+ "driver/chromedriver.exe").getCanonicalPath();
//		System.setProperty("webdriver.chrome.driver", chDriver);
//		System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)"
//				+ "\\Google\\Chrome\\Application\\chrome.exe");
//		driver = new ChromeDriver();
		
		
		baseUrl = "https://www.baidu.com/";
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testWD(){
		driver.get(baseUrl);
		
	}
	
	
	
	
	

}
