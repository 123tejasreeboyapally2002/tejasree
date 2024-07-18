package collection;

import java.util.ArrayList;

public class Democollection {
	public static  void main(String args[]) {
		ArrayList list =new ArrayList();
		list.add(12);
		list.add(15);
		list.add(39);
		list.add('a');
		list.add(3.14);
list.add("teja");
	System.out.println(list);
	list.add(1, 2);
	System.out.println(list);
	list.set(2, 60);
	System.out.println(list.equals(2));
	System.out.println(list.indexOf(12));
	System.out.println(list.remove("teja"));
	System.out.println(list);
	System.out.println(list.contains(1));
	System.out.println(list.addAll(list));
	System.out.println(list);
	}}