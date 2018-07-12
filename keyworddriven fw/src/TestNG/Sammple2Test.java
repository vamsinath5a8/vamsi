package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class Sammple2Test {
  @Test
  public void f() {
	  System.out.println("koushik");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("mahesh");  
  }

}
