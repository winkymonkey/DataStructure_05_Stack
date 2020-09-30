package com.example.datastructure.core.stackusingarray;

public class A01_stack_usingArray {
	public static void main(String[] args) {
		MyStack1 stack = new MyStack1();
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
