/*
	Problem Statement: Given a sorted array and a 'key'. Find a pair of index, if any, from the array whose values sums
	up to the 'key' value. You are to find only the first pair of match.
*/
package com.rohit.searches;

import java.util.ArrayList;
import java.util.List;

public class MatchSumWithKey {
	
	private static List<Integer> indexes = new ArrayList();
	
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5}; // assuming array is sorted in ascending order
		int key = 15;
		
		indexes = new MatchSumWithKey().findIndexes(0,array.length-1,array,key);

		if(indexes.isEmpty()) {
			System.out.println("No matched indexes...");
		} else {
			System.out.println(indexes.toString());
		}
		
	}
	
	private List<Integer> findIndexes(int low,int high,int array[],int key) {
		
		while(low<high) {
			if(array[low]+array[high] == key) {
				indexes.add(low);
				indexes.add(high);
				break;
			} else if(array[low]+array[high] < key) {
				++low;
			} else {
				--high;
			}
		}
		return indexes;
	}

}
