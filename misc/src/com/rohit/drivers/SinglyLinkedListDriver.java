package com.rohit.drivers;

import com.rohit.singlylinkedlist.LinkedList;

public class SinglyLinkedListDriver {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
	}

}
