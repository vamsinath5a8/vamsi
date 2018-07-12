package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample2 {

	@Test
	public void turtle3() {
		System.out.println("this is ap");
		System.out.println("this is app");
		}
	@AfterClass
	public static void tearDown() throws Exception {
		System.out.println("bye");
		}
	@Ignore
	@Test
	public void zi1ghdgayagdhug() {
		System.out.println("this is zebra");
		System.out.println("this is zebra2");
		
	}
	@Ignore
	@Test
	public void turtle2() {
		System.out.println("this is apple");
		System.out.println("this is apple2");
		}
	@BeforeClass
	public static void setUp() throws Exception {
		System.out.println("hi");
	}
	
	}
