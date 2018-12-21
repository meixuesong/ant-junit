package cn.meixs;

import junit.framework.TestCase;
import org.junit.Assert;


public class MyHello2Test extends TestCase {
	public void testHello() {
		MyHello hello = new MyHello();
		String result = hello.sayHello("ABCD");

		assertEquals("Hello, ABCD", result);
	}
}