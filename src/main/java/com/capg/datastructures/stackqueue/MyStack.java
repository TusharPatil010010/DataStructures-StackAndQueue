package com.capg.datastructures.stackqueue;

public class MyStack {
	private MyLinkedList stackList;

	public MyStack() {
		stackList = new MyLinkedList();
	}

	public void push(INode newNode) {
		stackList.add(newNode);
	}

	public void printStack() {
		stackList.printNodes();
	}
	
	public INode peak() {
		return stackList.head;
	}
	
	public INode pop() {
		return stackList.pop();
	}
}
