package com.capg.datastructures.stackqueue;

public class MyQueue {

	private MyLinkedList queueList;

	public MyQueue() {
		queueList = new MyLinkedList();
	}

	/**
	 * UC3 Adds an element to the queue
	 * 
	 * @param newNode
	 */
	public void enqueue(INode newNode) {
		queueList.append(newNode);
	}

	/**
	 * UC4 removes the last element from the queue
	 */
	public void dequeue() {
		queueList.pop();
	}

	public void printQueue() {
		queueList.printNodes();
	}
}
