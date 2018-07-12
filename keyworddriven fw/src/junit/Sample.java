package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Sample {

	@Before
	public void setUp() throws Exception {
		System.out.println("hi");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("bye");
	}
	@Ignore
	@Test
	public void test1() {
		System.out.println("this is junit");
		}
	@Ignore
     @Test
	public void zebra() {
		System.out.println("this is JUNIT");

}
}