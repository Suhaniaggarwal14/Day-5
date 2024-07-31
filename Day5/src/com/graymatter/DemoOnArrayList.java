package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
//import java.util.ListIterator;

//folows inserton order
//allows duplicates
//can add null vaues
//arraylist initial capacity is 10

public class DemoOnArrayList {

	public static void main(String[] args) {
		
//		ArrayList alist=new ArrayList();
//		alist.add(56);
//		alist.add("suhani");
//		alist.add(89.78);
//		alist.add(true);
//		
//		System.out.println(alist);
//		
//		alist.add(56);
//		alist.add("suhani");
//		alist.add(89.78);
//		System.out.println(alist);
//		alist.add(null);
//		alist.add(null);
//		System.out.println(alist);
//		
//		for(int i=0;i<alist.size();i++)
//			System.out.println(alist.get(i));
//		
		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.add(89);
//		list.add(67);
//		list.add(45);
//		list.add(33);
//		
//		for(int i:list)
//			System.out.println(i);
//		list.add(2,212);
//		System.out.println(list);
//		
//		list.addAll(3, alist);
//		System.out.println(list);
//		
////		for(var i:list)
////			System.out.println(i);
//		
//		list.remove(1);
//		System.out.println(list);
//		
//		System.out.println(list.contains(89));
//		alist.remove("suhani");
//		System.out.println(alist);
		
		list.clear();
		list.add(89);
		list.add(67);
		list.add(45);
		list.add(33);
		System.out.println(list);
		
		
		System.out.println("using iterator");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("using list iterator");
		ListIterator<Integer> listItr=list.listIterator();
		
		System.out.println("element print in backward direction");
		while(listItr.hasPrevious())
			System.out.println(listItr.previous());
		
		list.add(66);
		list.add(23);
		list.add(90);
	    System.out.println(list);
	    
	    Collections.sort(list);
	    System.out.println(list);
			
		
		
		
		
		
		
		
		

	}

}
