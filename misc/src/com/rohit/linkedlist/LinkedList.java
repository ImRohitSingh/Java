package com.rohit.linkedlist;

import com.rohit.util.List;

public class LinkedList<T> implements List<T> {

	private LinkedListNode<T> start = new LinkedListNode<>();
	
	private LinkedListNode<T> end = new LinkedListNode<>();
	
	public LinkedList() {
		start.setNext(null);
		end.setNext(null);
	}
	
	@Override
	public boolean isEmpty() {
		if(start.getNext() == null && end.getNext() == null) {
			return true;
		} else {
			return false;
		}
		
	}
	
	@Override
	public void add(T info) {
		LinkedListNode<T> createNode = new LinkedListNode<>();
		createNode.setInfo(info);
		createNode.setNext(null);
		if(isEmpty()) {
			start.setNext(createNode);
		} else {
			end.getNext().setNext(createNode);
		}
		end.setNext(createNode);
	}
	
	@Override
	public String toString() {
		StringBuilder list = new StringBuilder();
		if(isEmpty()) {
			list.append("Empty List");
		} else {
			LinkedListNode<T> traverseNode = new LinkedListNode<>();
			traverseNode.setNext(start.getNext());
			for( ; traverseNode.getNext() != null; traverseNode.setNext(traverseNode.getNext().getNext())) {
				if(traverseNode.getNext().getNext() == null) {
					list.append(traverseNode.getNext().getInfo());
				} else {
					list.append(traverseNode.getNext().getInfo() + " -> ");
				}
			}
		}
		return list.toString();
	}
	
}
