package howtoapply.a_designstack;

/**
 * *****************************************************************************
 * How to create mergable stack?
 * *****************************************************************************
 */
public class A09_design_mergableStack {
	/*
	 * Design a stack with following operations.
	 * 	a) push(Stack s, x)------------ Adds an item x to stack s
	 * 	b) pop(Stack s)---------------- Removes the top item from stack s
	 * 	c) merge(Stack s1, Stack s2)--- Merge contents of s2 into s1. (attach s2 at end of s1)
	 * 
	 * 
	 * 
	 * If we use array implementation of stack, then merge is not possible to do in O(1) time
	 * We should use linked-list which can track both 1st & last node 
	 * 
	 * 1) Use Single-Linked-List(SLL) having 2 pointers
	 * 	- one pointer for 1st node (used as top)
	 *  - one pointer for last node (so that we can quickly link the linked list of s2 at the end of s1)
	 * 
	 * 2) Use Circular-Linked-List(CLL)
	 * 	- last node will be used to link two linked list of s1 and s2
	 * 	- next of last node will be used as top
	 * 
	 * 
	 * 
	 */
}
