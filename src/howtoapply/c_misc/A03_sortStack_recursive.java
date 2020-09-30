package howtoapply.c_misc;

import java.util.Stack;

/**
 * *****************************************************************************
 * Sort a stack using recursion
 * *****************************************************************************
 * It's a modified version of "reverse a stack"
 * *****************************************************************************
 */
public class A03_sortStack_recursive {
	private static A03_sortStack_recursive obj = new A03_sortStack_recursive();
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(0);
		stack.push(1);
		stack.push(8);
		System.out.println(stack);
		
		obj.sort(stack);
		System.out.println(stack);
	}
	
	
	private void sort(Stack<Integer> stack) {
		if(stack.isEmpty())
			return;
		else {
			int elem = stack.pop();
			sort(stack);			
			sortedInsert(stack, elem);	//Here we can't simply call "stack.push(elem)", as the element which element was popped at last, will be pushed at first
		}
	}
	
	
	private void sortedInsert(Stack<Integer> stack, int elem) {
		if(stack.isEmpty() || elem>stack.peek()) {
			stack.push(elem);
		}
		else {
			int temp = stack.pop();
			sortedInsert(stack, elem);
			stack.push(temp);
		}
	}
}
