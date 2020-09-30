package com.example.datastructure.core.stackusingarray;

public class MyStack1 {
	private static final int MAX = 1000;
	private int top;
	private int A[];

	public MyStack1() {
		A = new int[MAX];
		top = -1;
	}
	
	
	
	public boolean isEmpty() {
		return (top < 0);
	}
	public int peek() {
		return top;
	}
	public boolean push(final int elem) {
		if (top >= MAX) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			A[++top] = elem;
			return true;
		}
	}
	public int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int elem = A[top--];
			return elem;
		}
	}
	
	
	
	@Override
	public String toString() {
		if(A == null)
            return null;
		if(top == -1)
            return "[]";

        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for(int i=0; ; i++) {
            builder.append(A[i]);
            if(i == top)
                return builder.append(']').toString();
            builder.append(", ");
        }
	}
}
