package com.rohit.searches;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchSumWithKey2 {

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
