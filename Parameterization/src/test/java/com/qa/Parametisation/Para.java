package com.qa.Parametisation;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Para {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {{1,2,3}, {6,7,8}});
//		same as:
//		Object[][] ob = new Object[2][3];
//		ob[0][0] = 1;
//		ob[0][1] = 2;
//		ob[0][2] = 3;
//		ob[1][0] = 6;
//		ob[1][1] = 7;
//		ob[1][2] = 8;
//		return Arrays.asList(ob);
	}
	
	private int x;
	private int y;
	private int z;
	
	public Para(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Test
	public void test() {
		System.out.println(x + " " + y +" "+ z);
	}
}
