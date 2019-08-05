package com.rohit.singlylinkedlist;

public class SinglyLinkedListNode<T> {

	private T info;
	
	private SinglyLinkedListNode<T> next;
	
	public T getInfo() {
		return info;
	}
	
	public void setInfo(T info) {
		this.info = info;
	}

	public SinglyLinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(SinglyLinkedListNode<T> next) {
		this.next = next;
	}
	
	
}
