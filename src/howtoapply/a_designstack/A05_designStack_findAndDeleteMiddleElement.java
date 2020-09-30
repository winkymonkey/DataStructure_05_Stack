package howtoapply.a_designstack;

/**
 * *****************************************************************************
 * Design a stack with operations on middle element
 * *****************************************************************************
 */
public class A05_designStack_findAndDeleteMiddleElement {
	/*
	 * findMiddle() which will return middle element of the stack ---- O(1) time
	 * deleteMiddle() which will delete the middle element ----------- O(1) time
	 * 
	 * 
	 * The important question is, whether to use a LINKED-LIST or ARRAY for implementation of stack?
	 * 	- For array, deleting an element from middle is NOT O(1)
	 * 	- For array, if we delete middle, we need bring all elements after it one index forward 
	 *  - So ARRAY is NOT feasible
	 * 	- For linked-list, we may need to move up middle pointer when we push(), and move down when we pop()
	 * 	- So LINKED-LIST is NOT feasible
	 * 
	 * 
	 * We can use DOUBLE LINKED LIST
	 *  - We can delete middle element in O(1) time by maintaining mid pointer
	 *  - We can move mid pointer in both directions using previous and next pointers
	 * 
	 */
}
