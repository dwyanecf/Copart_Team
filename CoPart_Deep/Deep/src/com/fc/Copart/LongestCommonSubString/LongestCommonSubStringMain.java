package com.fc.Copart.LongestCommonSubString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class LongestCommonSubStringMain {

	public static void main(String[] args) {

		String s1 = "defabscfabcdabsc";
		String s2 = "abcdef";

		List<Character> firstList = new ArrayList<Character>();
		List<Character> secondList = new ArrayList<Character>();
		List<Character> list = new ArrayList<Character>();
		Set<Character> set = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s1.length(); i++) {
			firstList.add(s1.charAt(i));
		}
		for (int i = 0; i < s2.length(); i++) {
			secondList.add(s2.charAt(i));
		}

		if (s1.equals(s2)) {
			System.out.println(s1);
		}

		else if (s2.contains(s1)) {
			System.out.println(s1);
		}

		else if (s1.contains(s2)) {
			System.out.println(s2);
		}

		for(int i=0;i<firstList.size();i++)
		{
			for(int j=0;j<secondList.size();j++)
			{
				if(firstList.contains(secondList.get(j)))
						{
					set.add(secondList.get(j));
						}
			}
			
		}
		
		String s = set.toString();
		s = s.replace("[","");
		s = s.replace("]","");
		String splitString[] = s.split(",");
		
	
		for(int i=0;i<splitString.length;i++)
		{
			sb.append(splitString[i]);
			String temp = sb.toString();
			if(s1.contains(temp))
			{
				System.out.println(sb.toString());
			}
			
		}
		
		
		}
	}


