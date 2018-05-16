package cn.tjuscs.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HelloWebDriver {
	
	public static final String SELENIUMCN_LINK="//td[div/span[contains(.,'tju.edu.cn/')]]/h3//a";

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.baidu.com");
		
		WebElement query = driver.findElement(By.name("wd"));
		Thread.sleep(2000);
		query.sendKeys("天津大学");
			
		WebElement btn = driver.findElement(By.id("su"));
		btn.click();
		Thread.sleep(2000);
		
		WebElement link = driver.findElement(By.linkText("天津大学-中国第一所现代大学"));
		
		link.click();
		Thread.sleep(5000);
		
		driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);
		
		System.out.println(driver.getTitle());

		//ch_driver.quit();

	}

}
