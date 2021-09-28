package com.myLearnings.basics.java;

public class peaknum {
	int i, a,max;
	void peak() {
	int a[]= {6,8,4,2,14,4,42};
	max=a[0];
	for(i=1;i<a.length;i++){
		if(max<a[i]) 
		{
		max=a[i];	
		}
		}
	System.out.print(max);
	}
	
public static void main(String args[]) {
	peaknum p=new peaknum();
	p.peak();
}
}
