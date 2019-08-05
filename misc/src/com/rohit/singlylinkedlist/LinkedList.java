package com.rohit.singlylinkedlist;

import com.rohit.util.List;

public class LinkedList<T> implements List<T> {

	private SinglyLinkedListNode<T> start = new SinglyLinkedListNode<>();
	private SinglyLinkedListNode<T> end = new SinglyLinkedListNode<>();
	
	public LinkedList() {
		start.setNext(null);
		end.setNext(null);
	}
	
	@Override
	public void add(T info) {
		SinglyLinkedListNode<T> createNode = new SinglyLinkedListNode<>();
		createNode.setInfo(info);
		createNode.setNext(null);
		if(start.getNext() == null && end.getNext() == null) {
			start.setNext(createNode);
		} else {
			end.getNext().setNext(createNode);
		}
		end.setNext(createNode);
	}
	
	@Override
	public String toString() {
		StringBuilder list = new StringBuilder();
		if(start.getNext() == null && end.getNext() == null) {
			list.append("Empty List");
		} else {
			SinglyLinkedListNode<T> traverseNode = new SinglyLinkedListNode<>();
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
