package com.myLearnings.basics.java;

public class reverseary {
	void reverse() {
		int a[]= {9,8,7,6,5,4,3,2,1};
		for(int i=a.length-1;i>=0;i--) 
		{
			   System.out.print(a[i]);
			   System.out.println();

		}
	}

public static void main(String args[]) {
	reverseary rev=new reverseary();
	rev.reverse();
	
}}
		



