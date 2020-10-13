package com.capg.datastructures.stackqueue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyQueueTest {

	@Test
	public void givenInputShouldAddToQueue() {
		
		MyQueue queue = new MyQueue();
		
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		
		queue.printQueue();
	}

}
