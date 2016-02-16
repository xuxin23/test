package test.j2se.base;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BatOperation {
	
	@Test
	public void testRetainAll() {
		List<String> la = new ArrayList<String>();
		la.add("java");
		la.add("perl");
		la.add("python");
		
		List<String> lb = new ArrayList<String>();
		lb.add("perl");
		lb.add("jquery");
		lb.add("extjs");
		
		List<String> list = new ArrayList<String>(la);
		list.retainAll(lb);
		
		System.out.println(list);
	}
	
}
