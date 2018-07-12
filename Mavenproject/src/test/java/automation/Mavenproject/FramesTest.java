package automation.Mavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FramesTest {
	WebDriver driver;
  @Test
  public void frames() {
	  System.setProperty("webdriver.chrome.driver", "D://vamsi//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("C:\\Users\\edu5\\Desktop\\frames.html");
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  
	  driver.switchTo().frame("testng");
	  driver.findElement(By.linkText("IDEA")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
