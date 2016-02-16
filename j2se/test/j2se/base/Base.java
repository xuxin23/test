package test.j2se.base;

import org.junit.Test;

public class Base {

	@Test
	public void test01() {
		System.out.println(2 << 3);
	}
	
	@Test
	public void test02() {
		action:
			for (int i=0; i<20; i++) {
				for (int j=0; j<20; j++) {
					if (i == 15 && j == 15) {
						break action;
					}
				}
			}
	}
	
	@Test
	public void test03() {
		String str = null;
		if (str != null && !str.equals("")) {
			System.out.println("&&:\ttest");
		}
		
		if (str != null & !str.equals("")) {
			System.out.println("&:\ttest");
		}
	}
	
	@Test
	public void test04() {
		short s1 = 1;
		// ±àÒë´íÎó
//		s1 = s1 + 1;
		
		short s2 = 1;
		s2 += 1;
	}
	
	@Test
	public void test05() {
		String str = "hello,ÉÏº£";
		byte[] b = str.getBytes();
		for (byte e:b) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		char[] c = str.toCharArray();
		for (char e:c) {
			System.out.println(e + "[" + (int)e + "]");
		}
	}
	
	@Test
	public void test06() {
		System.out.println(finallyTest());
	}
	
	private int finallyTest() {
		int i = 1;
		try {
			System.out.println("try:" + i);
			return i;
		}
		finally {
			++i;
			System.out.println("finally:" + i);
		}
	}
}
