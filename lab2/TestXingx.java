package cn.tjuscs.st;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cn.tjuscs.st.util.ReadWriteExcel;

public class TestXingx {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private static ArrayList<String> al,same,diff;
  
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	  System.out.println("Total: "+al.size());
	  System.out.println("Right: "+same.size()+"	Wrong: "+diff.size());
	  System.out.println("List the different below:");
	  for (String str : diff) {
		  System.out.println(str);
	  }
	}

  @Before
  public void setUp() throws Exception {
	  al=ReadWriteExcel.getData();
	  same=new ArrayList<String>();
	  diff=new ArrayList<String>();
	  System.out.println(al.size());
	System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); 
    driver = new FirefoxDriver();
    baseUrl = "https://psych.liebes.top/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testXingx() throws Exception {
	  for(int i=0;i<al.size();i++) {
		  String[] row=al.get(i).split("#");
		    driver.get(baseUrl + "/st");
		    driver.findElement(By.id("username")).clear();
		    driver.findElement(By.id("username")).sendKeys(row[0]);
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys(row[0].substring(4));
		    driver.findElement(By.id("submitButton")).click();
		    String url=driver.findElement(By.cssSelector("p.login-box-msg")).getText();
		    String err="Sign in to get your information";
		    if(url.equals(err)) {
		    	diff.add(row[0]+" Not Submit");
		    }
		    if(row.length==2) {
		    	if(row[1].contains(url))
		    		same.add(row[0]+" "+row[1]);
		    	else
		    		diff.add(row[0]+" "+row[1]);		    
		    }
	  }
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
