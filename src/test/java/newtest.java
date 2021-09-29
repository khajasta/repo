import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class newtest {

	private abc abcobject;
	@Before
	public void setUp() throws Exception {
		

		abcobject= new abc();
	}

	@Test
	public void test() {
		Assert.assertEquals(3,abcobject.add(1, 2) );
	}

}
