package cn.tjuscs.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ab {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.baidu.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAb() throws Exception {
    driver.get(baseUrl);
  /* 
    driver.findElement(By.id("kw")).click();
    driver.findElement(By.id("kw")).click();
    driver.findElement(By.id("kw")).clear();
    driver.findElement(By.id("kw")).sendKeys("selenium");
    driver.findElement(By.id("su")).click();
    assertEquals("selenium_�ٶ�����", driver.getTitle());
    */
    /*
    WebElement baiduTextBox = driver.findElement(By.id("kw"));
    Actions actiona = new Actions(driver);
    actiona.sendKeys(baiduTextBox,"qtp");
    actiona.build().perform();
    actiona.click(driver.findElement(By.id("su"))).build().perform();
    assertEquals("qtp_�ٶ�����", driver.getTitle());
    */
    ((JavascriptExecutor)driver).executeScript("arguments[0].value=arguments[1]",driver.findElement(By.id("kw")),"天津大学");
    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.id("su")));
    
//    driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("天津大学");
    
    
    Thread.sleep(2000);
    assertEquals("天津大学_百度搜索", driver.getTitle());
    
    
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

