package automation.Mavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class HeadlessTest {
	WebDriver driver;
  @Test
  public void headless() {
	  System.setProperty("webdriver.chrome.driver", "D://vamsi//chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("window_size=1400,800");
	  options.addArguments("headless");
	  driver=new ChromeDriver(options);
	  driver.get("https://www.facebook.com/");
	  
 System.out.println("the page title is :"+driver.getTitle());
  driver.quit();
  System.out.println("browser closed");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
