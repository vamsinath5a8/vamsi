package listeners;

import org.testng.annotations.Test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
//@Listeners(listeners.Itestlistenertest.class)
public class ListenerTest {
	WebDriver driver;
	
  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "D://vamsi//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php/user/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
  }
  @BeforeTest
  public void beforeTest() {
  }

}
