package com.rohit.stack;

import com.rohit.util.List;

public class Stack<T> implements List<T> {

	private Node<T> start = new Node<>();
	
	public Stack() {
		start.setNext(null);
	}

	@Override
	public boolean isEmpty() {
		if(start.getNext() == null) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public void add(T info) {
		Node<T> newNode = new Node<>();
		newNode.setInfo(info);
		newNode.setNext(start.getNext());
		
		start.setNext(newNode);
	}
	
	public T remove() {
		if(isEmpty()) {
			return null;
		} else {
			Node<T> delNode = new Node<>();
			delNode = start.getNext();
			T info = delNode.getInfo();
			start.setNext(delNode.getNext());
			delNode.setNext(null);
			return info;
		}
		
	}

}
