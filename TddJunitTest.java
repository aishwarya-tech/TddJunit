package MyPro;

import org.junit.*;

public class TddJunitTest {

	/*
	 * TODO List
	 * 1. 1A -> ABCD= BCD
	 * 2. 2A -> AACD= CD
	 * 3. BACD= BCD
	 * 4.BBAA= BBAA
	 * AABAA= BAA
	 */

	@BeforeEach
	void setup()
	{
		TddJunitDemo Remo = new TddJunitDemo();
	}
	
	@Test
	public void test1stA() {
		assertEquals("BCD",Remo.RemoveA("ABCD") );
	}
	
	@Test
	public void testAA() {
		assertEquals("CD",Remo.RemoveA("AACD") );
	}
	
	@Test
	public void test2stA() {
		assertEquals("BCD",Remo.RemoveA("BACD") );
	}
	
	@Test
	public void testnoA() {
		assertEquals("BBAA",Remo.RemoveA("BBAA") );
	}
	
	@Test
	public void test2As() {
		assertEquals("BAA",Remo.RemoveA("AABAA") );
	}
	
	


}
