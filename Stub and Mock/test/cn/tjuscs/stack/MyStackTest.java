package cn.tjuscs.stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyStackTest {
	private MyStack myStack;
	
	@Before
	public void setUp()
	{
		myStack = new MyStack();
	}
	
	@Test
	public void testPush(){
		try {
			myStack.push("hello world!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}
		
		String result = null;
		
		try {
			result = myStack.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}
		
		assertEquals("hello world!", result);
	}
	
	@Test
	public void testPush2(){
		for(int i=0;i<100;i++){
			try{
				myStack.push(i + "");
			}
			catch(Exception ex){
				fail();
			}
		}
		
		for(int i=0;i<100;i++){
			String result = null;
			try {
				result = myStack.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			assertEquals((99 - i) + "", result);
		}
	}
	
	@Test
	public void testPush3(){
		Exception tx = null;
		try {
			for (int i=0; i<=100;i++){
				myStack.push(i + "");
			} 
			
		}
		catch (Exception e) {

			tx = e;
			
			
		}
		
		assertNotNull(tx);
		assertEquals("越界异常！",tx.getMessage());
		assertEquals(Exception.class, tx.getClass());
	}
	
	@Test(expected = Exception.class)
	public void testPush4() throws Exception{
		for (int i=0;i<=100;i++){
			
				myStack.push(i + "");
			
		}
		
	}
	
	@Test
	public void testPop()
	{
		try {
			myStack.push("hello world!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}
		
		String result = null;
		
		try {
			result = myStack.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}
		
		assertEquals("hello world!", result);
	}
	
	@Test(expected = Exception.class)
	public void testPop2() throws Exception
	{
		Throwable tx = null;
		myStack.pop();
	}
	
	@Test(expected = Exception.class)
	public void testPop3() throws Exception 
	{
		try {
			myStack.push("heeloo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			myStack.pop();
			myStack.pop();
		
		
		
	}

}
