package cn.tjuscs.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloChrom {

	public static void main(String[] args) throws IOException {
		String chDriver = new File(new File(".").getCanonicalPath() + "\\" +"driver/chromedriver.exe").getCanonicalPath();
		System.out.println(chDriver);
		System.setProperty("webdriver.chrome.driver", chDriver);
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver ch_driver = new ChromeDriver();
		ch_driver.get("http://www.baidu.com");
		
		WebElement we = ch_driver.findElement(By.id("kw"));
		we.click();
		we.clear();
		we.sendKeys("天津大学");
		
		ch_driver.findElement(By.id("su")).click();
		
		
		
		
//		WebElement query = ch_driver.findElement(By.name("name"));
//		query.sendKeys("3013218049");
//		WebElement passwd = ch_driver.findElement(By.name("pwd"));
//		passwd.sendKeys("218049");
//		
//		WebElement btn = ch_driver.findElement(By.id("submit"));
//		btn.click();

	}

}
