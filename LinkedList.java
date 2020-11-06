package com.blz.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedList<K> {
	public static INode head;
	public static INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode<K> newNode) {
		if (this.tail == null && this.head == null) {
			this.tail = newNode;
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void append(INode<K> myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public void Insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public INode Search(K key) {
		INode tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public void SearchInsert(K key, INode newNode) {
		INode tempNode = head;
		while (!(tempNode.getKey() == key)) {
			tempNode = tempNode.getNext();
		}
		Search(key);
		Insert(tempNode, newNode);
	}

	public int Size() {
		int size = 0;
		if (this.head == null) {
			return size;
		}
		INode tempNode = this.head;
		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		System.out.println(size + 1);
		return size + 1;
	}

	public INode Delete(K key) {
		INode firstNode = head;
		INode tempNode = head;
		while (!(tempNode.getKey() == key)) {
			tempNode = tempNode.getNext();
		}
		this.head = tempNode;
		pop();
		INode LastNode = this.head;
		this.head = firstNode;
		INode tempNode1 = this.head;
		while (tempNode1.getNext().getKey() != key) {
			tempNode1 = tempNode1.getNext();
		}
		tempNode1.setNext(LastNode);
		return this.head;
	}

	@Override
	public String toString() {
		return "LinkedListNodes{" + head + '}';
	}

}