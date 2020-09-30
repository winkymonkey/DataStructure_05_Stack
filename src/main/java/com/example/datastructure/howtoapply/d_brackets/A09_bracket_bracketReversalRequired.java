package com.example.datastructure.howtoapply.d_brackets;

/**
 * *****************************************************************************
 * Minimum number of bracket reversals needed to make an expression balanced
 * *****************************************************************************
 */
public class A09_bracket_bracketReversalRequired {
	/*
	 * The idea is to first remove all balanced part of expression.
	 * For example, convert �}{{}}{{{� to �}{{{�
	 * 
	 * If we take a closer look we can notice that,
	 * 	after removing balanced part, we always end up with an expression of the form }}�}{{�{
	 * 
	 * Such an expression contains 0/more closing brackets followed by 0/more opening brackets.
	 * Let m=total number of closing brackets
	 * 	   n=total number of opening brackets
	 * 
	 * We need CEIL(m/2) + CEIL(n/2) reversals
	 * 
	 */
}
