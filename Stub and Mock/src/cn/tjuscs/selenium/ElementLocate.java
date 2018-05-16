package cn.tjuscs.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mail.tju.edu.cn");
		
		String pageTitleString = driver.getTitle();
		String pageUrlString = driver.getCurrentUrl();
		
		System.out.println(pageTitleString);
		System.out.println(pageUrlString);
		
		
		
		WebElement element = driver.findElement(By.id("account_name"));
		element.sendKeys("vincent");
		
		WebElement elementpasswd = driver.findElement(By.id("password"));
		elementpasswd.sendKeys("123321");
		
		
		//2. Multiple Element
		List<WebElement> elements =  driver.findElements(By.tagName("input"));
		
		for (WebElement e:elements){
			System.out.println(e.getAttribute("id"));
		}
			
		//Get Window handle and locate elements in different windows.
		/*element = driver.findElement(By.linkText("帮助中心"));
		element.click();
		
		String[] handlerStrings = new String[driver.getWindowHandles().size()];
		driver.getWindowHandles().toArray(handlerStrings);
		
		for (int i=0; i<driver.getWindowHandles().size();i++){
			WebDriver handlerDriver = driver.switchTo().window(handlerStrings[i]);
			System.out.println("windows handler:" + handlerDriver.getTitle());
		}
			
		*/
		//driver.quit();
		
		

	}

}
