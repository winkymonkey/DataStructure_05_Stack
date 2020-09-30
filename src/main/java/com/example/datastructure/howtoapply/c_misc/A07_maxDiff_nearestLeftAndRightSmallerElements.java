package com.example.datastructure.howtoapply.c_misc;

/**
 * *****************************************************************************
 * Find maximum difference between nearest left and right smaller elements
 * *****************************************************************************
 * I/P: {2, 1, 8}
 * O/P: 1			//LS[]={0,0,1},	RS[]={1,0,0},	Max_diff = abs(LS[i]-RS[i]) = 1 
 * 
 * I/P: {2, 4, 8, 7, 7, 9, 3}
 * O/P: 4			//LS[]={0,2,4,4,4,7,2},	RS[]={0,3,7,3,3,3,0},	Max_diff = abs(LS[i]-RS[i])=7-3=4
 * 
 * *****************************************************************************
 */
public class A07_maxDiff_nearestLeftAndRightSmallerElements {
	/*
	 * This is based on "Next Greater Element"
	 * 1. Find Next Smaller Element & maintain them in an array LS[]
	 * 2. Reverse the input array
	 * 3. Find Next Smaller Element & maintain them in an array RS[]
	 * 4. Traverse a loop & compare LS[i] and RS[i]
	 * 
	 */
}
