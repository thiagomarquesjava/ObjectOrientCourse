

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AntesDepois {
	
	@BeforeClass
	public static void beforeClass() { 
		System.out.println("@before Class");
	}
	
	@AfterClass
	public static void afterClass() { 
		System.out.println("@After Class");
	}
	
	@Before
	public void before(){
		System.out.println("@before");
	}
	
	@After
	public void after(){
		System.out.println("@after");
	}
	
	@Test
	public void test1() {
		System.out.println("teste1");
	}
	@Test
	public void test2() {
		System.out.println("teste2");
	}
	@Test
	public void test3() {
		System.out.println("teste3");
	}

}
