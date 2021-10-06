package org.junit;

public class JunitTesting {
	@BeforeClass
	public static void tc1() {
		System.out.println("1");

	} 
	@After
	
	public void tc2() {
	System.out.println("4");	

	}
	@Test
	public void tc3() {
		System.out.println("3");

	}
	@Test
	public void tc0() {
		System.out.println("need to run first");

	}
	@AfterClass
	public static void tc4() {
		System.out.println("5");
		

	}
	@Before
	public void tc5() {
	System.out.println("2");

	}

}
