package com.capg.datastructures.stackqueue;

public class MyStack {
	private MyLinkedList stackList;

	public MyStack() {
		stackList = new MyLinkedList();
	}

	/**
	 * UC1 pushes elements into a stack
	 * @param newNode
	 */
	public void push(INode newNode) {
		stackList.add(newNode);
	}

	public void printStack() {
		stackList.printNodes();
	}
	
	/**
	 * UC2 peaks into the stack
	 * 
	 * @return
	 */
	public INode peak() {
		return stackList.head;
	}
	
	/**
	 * UC2 pops the element from stack
	 * 
	 * @return
	 */
	public INode pop() {
		return stackList.pop();
	}
}
