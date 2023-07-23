import static org.junit.Assert.*;

import org.junit.Test;

import pkg_1.MyClass;

public class MyTestClass {

	@Test
	public void test() {
		
		MyClass ob = new MyClass();
		assertEquals(9,ob.avg(6, 14, 7));
		
	}

}
