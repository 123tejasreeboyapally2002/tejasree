package collection;

import java.util.TreeMap;

public class DemoTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(11, "Developer");
		treemap.put(2, "Tester");
		treemap.put(13, "Tech Support");
		treemap.put(41, "Data Base Administrator");
		treemap.put(32, "Data Analyst");
		treemap.put(-4, "Data Base Administrator");
		System.out.println(treemap);
		System.out.println(treemap.containsValue("Data Analyst"));
		System.out.println(treemap.containsKey(2));
		System.out.println(treemap.remove(2));
		System.out.println(treemap.size());
		System.out.println(treemap.size());
		treemap.put(0, null);
		System.out.println(treemap);
		System.out.println(treemap.floorKey(41));
		System.out.println(treemap.ceilingKey(41));
	}}




