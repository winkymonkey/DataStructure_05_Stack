package howtoapply.a_designstack;

/**
 * *****************************************************************************
 * Implement a stack using single queue
 * *****************************************************************************
 */
public class A04_designStack_usingOneQueue {
	/*
	 * START
	 * 		[]
	 * 		count=0
	 * 
	 * PUSH 10
	 * 		enqueue 10
	 * 		[10]
	 * 		count=1
	 * 
	 * PUSH 20
	 * 		enqueue 20
	 * 		[10, 20]
	 * 		count=2
	 * 
	 * PUSH 30
	 * 		enqueue 30
	 * 		[10, 20, 30]
	 * 		count=3
	 * 
	 * POP
	 * 		for (count-1) times, dequeue and enqueue again in same queue
	 * 		[10, 20, 30] ---> [30, 10, 20]
	 * 		now dequeue one element
	 * 		[30, 10, 20] ---> [10, 20]
	 * 
	 */
}
