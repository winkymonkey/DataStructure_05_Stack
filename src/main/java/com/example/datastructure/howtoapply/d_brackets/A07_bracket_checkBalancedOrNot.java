package com.example.datastructure.howtoapply.d_brackets;

/**
 * *****************************************************************************
 * Check for balanced parentheses in an expression
 * *****************************************************************************
 * I/P: [()]{}{[()()]()}
 * O/P: true
 * 
 * I/P: [(])
 * O/P: false
 * 
 * *****************************************************************************
 */
public class A07_bracket_checkBalancedOrNot {
	/*
	 * Traverse the expression
	 * 
	 * If A[i] is ( or { or [
	 * 	 stack.push(A[i])
	 * 
	 * If A[i] is ) or } or ]
	 *   If (stack is empty)
	 *  	//print "not balanced"
	 *   Else {
	 *   	stack.pop();
	 *   	If current character complements the popped character
	 *   		//print "balanced"
	 *   	Else
	 *   		//print "not balanced"
	 *   }
	 * }
	 *   
	 */
}
