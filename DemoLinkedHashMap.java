package collection;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> countrycodes=new LinkedHashMap<String,Integer>();
	countrycodes.put("US",1);
	countrycodes.put("India",91);
	countrycodes.put("Russia",7);
	countrycodes.put("china",86);
	countrycodes.put("Australia",61);
	countrycodes.put("pakistan",92);
	countrycodes.put(null,0);
	System.out.println(countrycodes);
	System.out.println(countrycodes.containsKey("US"));
	
	}

}
