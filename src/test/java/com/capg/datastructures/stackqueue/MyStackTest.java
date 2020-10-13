package com.capg.datastructures.stackqueue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MyStackTest {

	@Test
	public void whenGivenInput_ShouldAddToStack() {
		
		MyStack stack = new MyStack();
		
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);
		
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		
		stack.printStack();
	}
	
	@Test
	public void whenGivenMethod_ShouldMatchPoppedValue_WithLastNode() {
		MyStack stack = new MyStack();
		
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);
		
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		
		INode<Integer> pop = stack.pop();
		stack.printStack();
		assertEquals(pop, myThirdNode);
	}
}