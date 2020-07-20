package epam_task.tddjunit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class removeAtest {
	
	remove2chars re2c;
	
	@BeforeEach
	void setup()
	{
		re2c=new remove2chars();
	}
	
	@Test
	void testcase1() 
	{
		//String res=re2c.removal("ABCD");
		assertEquals("BCD",re2c.removal("ABCD"));
	}
	
	@Test
	void testcase2() 
	{
		assertEquals("CD",re2c.removal("AACD"));
	}
	
	@Test
	void testcase3() 
	{
		assertEquals("BCD",re2c.removal("BACD"));
	}
	
	@Test
	void testcase4() 
	{
		assertEquals("BBAA",re2c.removal("BBAA"));
	}
	
	@Test
	void testcase5() 
	{
		assertEquals("BAA",re2c.removal("AABAA"));
	}
}
