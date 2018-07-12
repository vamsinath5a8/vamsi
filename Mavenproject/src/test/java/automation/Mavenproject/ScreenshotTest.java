package automation.Mavenproject;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ScreenshotTest {
	WebDriver driver;
  @Test
  public void ss() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "D://vamsi//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php/user/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src,new File("D:\\vamsi\\screenshot\\frame.jpeg"));
//org.openqa.selenium.io.FileHandler.copy(src,new File("D:\\vamsi\\screenshot\\frame.jpeg"));//using filehandler
	  
  }
  @BeforeTest
  public void beforeTest() {
  }
     

}
