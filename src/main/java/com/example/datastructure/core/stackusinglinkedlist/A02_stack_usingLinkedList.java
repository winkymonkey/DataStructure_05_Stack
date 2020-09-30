package com.example.datastructure.core.stackusinglinkedlist;

public class A02_stack_usingLinkedList {
	public static void main(String[] args) throws Exception {
		MyStack2 stack = new MyStack2();
		System.out.println("initially:: " + stack);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("after a few push:: " + stack);
		
		stack.pop();
		System.out.println("after one pop:: " + stack);
		
		stack.pop();
		System.out.println("after one pop:: " + stack);
		
		stack.push(90);
		System.out.println("after a few push:: " + stack);
		
		stack.pop();
		System.out.println("after one pop:: " + stack);
	}
}
