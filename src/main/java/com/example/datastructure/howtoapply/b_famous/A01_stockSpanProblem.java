package com.example.datastructure.howtoapply.b_famous;

/**
 * *****************************************************************************
 * The Stock Span Problem
 * *****************************************************************************
 */
public class A01_stockSpanProblem {
	/*
	 * ----------------
	 * ---PHILOSOPHY---
	 * ----------------
	 * Maintain the sequence of indexes in Stack where "Prices" are in decreasing order.
	 * Stack will store indexes of most recent decreasing sequence
	 * 
	 * 
	 * 
	 * ---------------
	 * ---ALGORITHM---
	 * ---------------
	 * PRICE[] = {10, 4, 5, 90, 120, 80}
	 * SPAN[] = {}
	 * stack.push(0);		//push index of first element to it
	 * SPAN[0] = 1;			//span value of first element is always 1
	 * 
	 * for(i=0 to length) {
	 * 	 while(!stack.empty() && PRICE[stack.top()] <= PRICE[i])
	 * 		stack.pop();
	 * 	 
	 * 	 SPAN[i] = (stack.empty())? (i + 1) : (i - stack.top());
	 * 	 stack.push(i);
	 * }
	 * 
	 * TIME -- O(n)
	 * We can observe that every element of array is added and removed from stack at most once.
	 * So there are total 2n operations at most.
	 * 
	 * SPACE -- O(n)
	 * 
	 */
}
