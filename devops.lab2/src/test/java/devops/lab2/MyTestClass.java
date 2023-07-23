package devops.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTestClass {

	@Test
	public void test() {
			MyClass obj = new MyClass();
	     assertEquals(14,obj.sum(10, 4));  
	}
}

