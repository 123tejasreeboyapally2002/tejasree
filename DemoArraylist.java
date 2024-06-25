package collection;

import java.util.ArrayList;

public class DemoArraylist {

	public static void main(String args[]) {
		//creating arrayList for storing integer values
		ArrayList<Integer> list = new ArrayList<Integer>();
		// giving elements to ArrayList//
		list.add(12);
		list.add(15);
		list.add(39);
		list.add(20);
		list.add(50);
		// printing the arrayList //
		System.out.println(list);
		// adding element with specific index position
		list.add(1, 2);
		System.out.println(list);
		// setting the element at specific index
		list.set(2, 60);
		System.out.println(list);
		System.out.println(list.equals(2));
		// it gives index of specific position//
		System.out.println(list.indexOf(39));

		System.out.println(list);
		// element is contain in the arrayList or not//
		System.out.println(list.contains(12));
		// print the element of index which is given element
		System.out.println(list.lastIndexOf(12));

		 System.out.println(list.addAll(list));
		System.out.println(list);
	}
}
