package test.j2se.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayAndCollection {

	@Test
	public void testArrayToCollection() {
		String[] arr = {"kobe", "james", "wade", "paul"};
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		list.add("л╚©урв");
		System.out.println(list);
	}
	
	@Test
	public void testCollectionToArray() {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		
		String[] arr = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
	}
	
}
