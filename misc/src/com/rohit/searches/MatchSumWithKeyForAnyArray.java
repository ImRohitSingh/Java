/*
	Problem Statement: Given any array and a 'target'. Find a pair of index, if any, from the array whose values sums
	up to the 'target' value. You are to find only and exactly the first pair of match. Consider that the array has no
	duplicate elements.
*/
package com.rohit.searches;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchSumWithKeyForAnyArray {

	private static List<Integer> indexes = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		int key = 6;

		indexes = new MatchSumWithKey2().findIndexes(array,key);
		
		if(indexes.isEmpty()) {
			System.out.println("No matched indexes...");
		} else {
			System.out.println(indexes.toString());
		}
		
	}

	private List<Integer> findIndexes(int[] array,int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int difference;
		for(int i = 0; i<array.length; ++i) {
			difference = target - array[i];
			Integer value = map.get(array[i]);
			if(value == null) {
				map.put(difference, i);
			} else {
				indexes.add(value);
				indexes.add(i);
				break;
			}
		}
		return indexes;
	}

}
