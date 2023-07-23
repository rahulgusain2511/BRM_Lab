import static org.junit.Assert.*;

import org.junit.Test;

import devops.lab2.reverse;

public class MyTestClass {

	@Test
	public void test() {
		reverse obj = new reverse();
	     assertEquals(743,obj.rev(347)); ;
	}

}
