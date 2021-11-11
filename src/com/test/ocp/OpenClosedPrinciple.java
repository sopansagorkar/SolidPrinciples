package com.test.ocp;

public class OpenClosedPrinciple {

	public static void main(String[] args) {
		int arr[]={5,2,3,1,4};
		ArrayUtil.sort(arr,new DescOrderCompare());
		System.out.println("values in array are :");
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
