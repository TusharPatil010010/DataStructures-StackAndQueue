package com.capg.datastructures.stackqueue;

public class MyQueue {
	
	private MyLinkedList queueList;

	public MyQueue() {
		queueList = new MyLinkedList();
	}

	public void enqueue(INode newNode) {
		queueList.append(newNode);
	}

	public void printQueue() {
		queueList.printNodes();
	}
}
