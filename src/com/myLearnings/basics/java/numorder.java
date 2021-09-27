package com.myLearnings.basics.java;
public class numorder {
	int a=0;
	void order()
	{
		if(a<11)
		{
			System.out.println(a);
		a++;
		order();
		}
	}
public static void main(String args[]) {
numorder b=new numorder();
 b.order();
}}