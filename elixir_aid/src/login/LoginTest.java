package login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginTest {
	WebDriver driver;
  
  @BeforeClass
  public void browserlaunch() {
	  System.setProperty("webdriver.chrome.driver", "D://vamsi//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php/user/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  
	  }
  
  @Test
  public void f() {
	  
  }
  @AfterClass
  public void afterClass() {
  }

}
