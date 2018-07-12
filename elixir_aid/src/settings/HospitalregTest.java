package settings;

import org.testng.annotations.Test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class HospitalregTest {
	WebDriver driver;
	@Test
  public void settings() {
		driver=new ChromeDriver();
		driver.findElement(By.id("//li[@class='active']//a[@href='#']")).click();
		}
	
  @BeforeTest
  public void beforeTest() {
  }

}
