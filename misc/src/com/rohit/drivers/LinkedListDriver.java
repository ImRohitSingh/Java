package com.rohit.drivers;

import com.rohit.linkedlist.LinkedList;

public class LinkedListDriver {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Rohit Singh");
		list.add("Chris Ron");
		list.add("Paul Scholes");
		list.add("Iniesta");
		System.out.println(list);
	}

}
