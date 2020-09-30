package howtoapply.c_misc;

import java.util.Stack;

/**
 * *****************************************************************************
 * Reverse a stack using recursion
 * *****************************************************************************
 */
public class A02_reverseStack_recursive {
	private static A02_reverseStack_recursive obj = new A02_reverseStack_recursive();
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(0);
		stack.push(1);
		stack.push(8);
		System.out.println(stack);
		
		obj.reverse(stack);
		System.out.println(stack);
	}
	
	
	private void reverse(Stack<Integer> stack) {
		if(stack.isEmpty())
			return;
		else {
			int elem = stack.pop();
			reverse(stack);			
			insertAtBottom(stack, elem);	//Here we can't simply call "stack.push(elem)", as the element which element was popped at last, will be pushed at first
		}
	}
	
	
	private void insertAtBottom(Stack<Integer> stack, int elem) {
		if(stack.isEmpty()) {
			stack.push(elem);
		}
		else {
			int temp = stack.pop();
			insertAtBottom(stack, elem);
			stack.push(temp);
		}
	}
}
