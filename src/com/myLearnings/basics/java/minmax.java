package com.myLearnings.basics.java;

public class minmax {
	int a[]= {3,2,5,12,13,43,25,23}
	,min,max;
	void max() {
	int i;	
	max=a[0];
	for (i=1;i<a.length;i++) {
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println(max);

	}
void min() {
	int i;
	min=a[0];
	for(i=1;i<a.length;i++) {
		if(min>a[i]) {
			min=a[i];
			
		}
	}
	System.out.println(min);
}

public static void main(String args[]) {
	minmax num=new minmax();
	num.max();
	num.min();
}}
