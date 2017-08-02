package com.fc.Copart.SmallestSubset;

import java.util.Arrays;

public class SmallestSubSetModel {
	
	private int sum;
	private int subset[];
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int[] getSubset() {
		return subset;
	}
	public void setSubset(int[] subset) {
		this.subset = subset;
	}
	@Override
	public String toString() {
		return "SmallestSubSetModel [sum=" + sum + ", subset=" + Arrays.toString(subset) + "]";
	}
	
	
	

}
