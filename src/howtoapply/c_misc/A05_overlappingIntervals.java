package howtoapply.c_misc;

public class A05_overlappingIntervals {
	/*
	 * class Interval implements Comparable<Interval> {
	 * 		int startTime;
	 * 		int endTime;
	 * 		//getter & setter
	 * 		public int compareTo() {
	 * 			return this.startTime - interval.startTime;
	 * 		}
	 * }
	 * 
	 * Interval arr[];
	 * Interval i1 = new Interval(6,8);
	 * Interval i1 = new Interval(1,9);
	 * Interval i1 = new Interval(2,4);
	 * Interval i1 = new Interval(4,7);
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * --Sort the array based on the starting time
	 * Arrays.sort(arr);		//(1,9),(2,4),(4,7),(6,8)
	 * 
	 * 
	 * --Push first interval into Stack
	 * Stack.push(arr[0]);
	 * 
	 * 
	 * for(i=2nd interval to end) {
	 * 	 if(the current interval DOESN'T overlap with the stack.top) {	//(top.endTime < arr[i].start)
	 * 		stack.push(arr[i])											//push current interval into stack
	 * 	 }
	 * 	 else {
	 * 		if(ending time of current interval > ending time of stack.top){
	 * 			ending time of stack.top = ending time of current interval;
	 * 		}
	 * 		else{
	 * 			discard current interval
	 * 		}
	 * 	 }
	 * }
	 * 
	 * At the end stack contains the merged intervals.
	 * TIME -- O(n*log(n))
	 * 
	 * 
	 * 
	 * 
	 * -----------------------------
	 * ---MORE EFFICIENT APPROACH---
	 * -----------------------------
	 * In above problem, the sorting takes time of O(n*log(n)) & merging happens in O(n) time
	 * But the merge process takes O(n) extra space.
	 * 
	 * We can reduce the space, if we can do in-place merging
	 * 
	 */
}
