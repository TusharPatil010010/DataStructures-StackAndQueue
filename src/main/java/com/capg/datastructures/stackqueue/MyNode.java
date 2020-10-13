package com.capg.datastructures.stackqueue;

public class MyNode<K> implements INode<K>{

	private K key;
	private INode next;

	public MyNode(K key) {
		this.key = key;
		this.setNext(next);
	}

	public INode getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}
}
