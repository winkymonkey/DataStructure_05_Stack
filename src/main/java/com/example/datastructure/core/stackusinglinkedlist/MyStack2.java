package com.example.datastructure.core.stackusinglinkedlist;

import com.example.datastructure.core.stackusinglinkedlist.MyLinkedList.Node;

public class MyStack2 {
	private MyLinkedList list;
	
	public MyStack2() {
		list = new MyLinkedList();
	}
	
	
	
	public boolean isEmpty() {
		return (list.head == null);
	}
	public int peek() {
		return list.head.data;
	}
	public void push(final int elem) {
		Node newNode = new Node(elem);
		if(list.head == null)
			list.head = newNode;
		else {
			newNode.next = list.head;
			list.head = newNode;
		}
	}
	public int pop() throws Exception {
		Node tempNode = list.head;
		if(tempNode == null)
			throw new Exception("stack underflow");
		else {
			list.head = list.head.next;
			tempNode.next = null;
			return tempNode.data;
		}
	}
	
	
	
	@Override
	public String toString() {
		/*StringBuilder sbu = new StringBuilder();
		Node temp = list.head;
		if(temp != null) {
			while(temp != null) {
				sbu.append("\n" + temp.data);
				temp = temp.next;
			}
		}
		return sbu.toString();*/
		StringBuilder sbu = new StringBuilder();
		Node temp = list.head;
		while(temp != null) {
			sbu.append(temp.data + " -> ");
			temp = temp.next;
		}
		sbu.append("NULL");
		return sbu.toString();
	}
	
	
	
	
	
	
	
	
	
	
	/*private Node top;
	
	MyStack2() {
		top = null;
	}
	
	
	
	public boolean isEmpty() {
		return (top == null);
	}
	public int peek() {
		return top.data;
	}
	public void push(int elem) {
		Node newnode = new Node(elem);
		if(top == null) {
			top = newnode;
		}
		else {
			newnode.next = top;
			top = newnode;
		}
	}
	public int pop() {
		if(top == null) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int elem = top.data;
			Node temp = top;
			top = top.next;
			temp.next = null;
			return elem;
		}
	}*/
	
	
	
}
