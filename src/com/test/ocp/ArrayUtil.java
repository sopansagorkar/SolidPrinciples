package com.test.ocp;

public class ArrayUtil {
	
	public static final void sort(int a[],ValueComparator comparator){
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(comparator.compare(a[i], a[j])>0){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}

}
