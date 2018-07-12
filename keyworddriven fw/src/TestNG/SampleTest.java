package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SampleTest {
  @Test(priority=0,enabled=false)
  public void ahi() {
	  System.out.println("hi");
  }
  @Test()
  public void bvamsi() {
	  System.out.println("darling");
  }
  @BeforeTest
  public void cbeforeTest() {
	  System.out.println("hello");
  }

  @AfterTest()
  public void dafterTest() {
	  System.out.println("bye");
  }

}
