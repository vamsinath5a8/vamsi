package automation.Mavenproject;

import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
public class uploadTest {
	WebDriver driver;
 @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D://vamsi//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://pdf2doc.com/");
	  driver.manage().window().maximize();
  }
  @Test
  public void upload() throws Exception {
	  driver.findElement(By.xpath("//span[@class='ui-button-text'][contains(text(),'Upload Files')]")).click();
	  Runtime.getRuntime().exec("D:\\vamsi\\workspace\\upload.exe");
	  
	  
	  
  }

}
