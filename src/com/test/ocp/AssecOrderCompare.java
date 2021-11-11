package com.test.ocp;

public class AssecOrderCompare implements ValueComparator{

	@Override
	public int compare(int value1, int value2) {
		
		return value1-value2;
	}

}
