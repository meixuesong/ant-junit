package cn.meixs;

import junit.framework.TestCase;
import org.junit.Assert;


public class MyHelloTest extends TestCase {
	public void testHello() {
		MyHello hello = new MyHello();
		String result = hello.sayHello("ABC");

		assertEquals("Hello, ABC", result);
	}
}