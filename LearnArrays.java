package week3.day2;

import java.util.Arraylist;
public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Learn collection
		String[] name = new String[5];
		java.util.List<String> list = new ArrayList<>();  // <String> Generic of the list
		list.add("singa");
		list.add("baskar");
		list.add("mani");
		list.add("naveen");
		list.add(1,"hari");
		list.set(4, "viji");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.contains("hari")); //help us to find a particular vaue
		System.out.println(list.size());
		// list.clear(;
		// System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		
		
		
		
		

	}

}
