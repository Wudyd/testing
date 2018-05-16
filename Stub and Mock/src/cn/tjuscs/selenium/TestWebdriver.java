package cn.tjuscs.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebdriver {
	private WebDriver wd;
	private String url;
	
	@Before
	public void setUp() throws IOException {
		
		wd = new FirefoxDriver();
		url = "http://www.baidu.com";
		
		
	}
	
	@Test
	public void testWD(){
		wd.get(url);
	}
	

}
