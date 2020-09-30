package com.example.datastructure.howtoapply.d_brackets;

/**
 * *****************************************************************************
 * Find if an expression has duplicate parenthesis or not
 * *****************************************************************************
 * I/P: ((a+b)+((c+d)))
 * O/P: DUPLICATE				//"c+d" is surrounded by two pairs of brackets.
 * 
 * I/P: (((a+(b)))+(c+d))
 * O/P: DUPLICATE				//"a+(b)" is surrounded by two pairs of brackets.
 * 
 * I/P: (((a+(b))+c+d))
 * O/P: DUPLICATE				//The whole expression is surrounded by two pairs of brackets.
 * 
 * I/P: ((a+b)+(c+d))
 * O/P: NO DUPLICATE
 * 
 * *****************************************************************************
 */
public class A10_bracket_checkDuplicateBracket {
	/*
	 * Traverse the expression
	 * If A[i] is '(' OR 'letter' OR 'symbol'
	 * 	 Push into stack
	 * If A[i] is ')'
	 * 	 Pop all elements from stack until '('
	 * 
	 * However if the immediate pop hits is open parenthesis '(',
	 * then we have found a duplicate parenthesis
	 * 
	 */
}
