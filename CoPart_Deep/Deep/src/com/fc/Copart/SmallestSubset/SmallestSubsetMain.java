package com.fc.Copart.SmallestSubset;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SmallestSubsetMain {
	
	SmallestSubSetModel model = new SmallestSubSetModel();
	
	private static int set[] = {1,2,3,9,5};
	private static int sum = 8;
	private static final String FILENAME = "C:\\input.txt";
	
	public static void main(String args[])
	{
		
		List<Integer> setList = readArray();
		
		System.out.println("The given set is" + setList);
		
		System.out.println("The  subset is "+printSumPairs(setList));
		
	}
	private static HashSet<Integer> printSumPairs(List<Integer> setList)
	{
		HashSet<Integer> sortedSet = new HashSet<Integer>();
		for(int i:set)
		{
			setList.add(i);
		}

		for(int i=0;i<setList.size();i++)
		{
			int temp = sum - setList.get(i);
			
			if(setList.contains(temp))
			{
				
				sortedSet.add(setList.get(i));
				sortedSet.add(temp);
			}
			
		}
		
		return sortedSet;
	}
	
	
	
	
	private static List<Integer> readArray()
	{
		List<Integer> setList = new ArrayList<Integer>();
		for(int i:set)
		{
			setList.add(i);
		}
		return setList;
	}
}
